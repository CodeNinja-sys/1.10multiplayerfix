/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.JsonParser$Feature
 *  com.fasterxml.jackson.databind.JsonNode
 *  com.fasterxml.jackson.databind.ObjectMapper
 */
package org.apache.logging.log4j.core.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.ac;
import org.apache.logging.log4j.core.config.c;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.apache.logging.log4j.core.config.plugins.k;
import org.apache.logging.log4j.core.config.plugins.n;
import org.apache.logging.log4j.core.config.q;
import org.apache.logging.log4j.core.config.s;
import org.apache.logging.log4j.core.config.t;
import org.apache.logging.log4j.core.config.y;
import org.apache.logging.log4j.core.d.m;
import org.apache.logging.log4j.d.a;

public class r
extends c
implements ac {
    private static final String[] i = new String[]{n.class.getName()};
    private static final int j = 16384;
    private final List k = new ArrayList();
    private JsonNode l;
    private final List m = new ArrayList();
    private final File n;

    public r(h h2) {
        this.n = h2.a();
        try {
            Object object;
            InputStream inputStream = h2.c();
            byte[] arrby = this.a(inputStream);
            inputStream.close();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
            ObjectMapper objectMapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_COMMENTS, true);
            this.l = objectMapper.readTree((InputStream)byteArrayInputStream);
            if (this.l.size() == 1) {
                object = this.l.elements();
                this.l = (JsonNode)object.next();
            }
            this.a(this.b, this.l);
            object = this.h();
            boolean bl2 = false;
            PrintStream printStream = System.out;
            for (Map.Entry entry : this.b.a().entrySet()) {
                if ("status".equalsIgnoreCase((String)entry.getKey())) {
                    object = org.apache.logging.log4j.b.a(this.l().a((String)entry.getValue()), null);
                    if (object != null) continue;
                    object = org.apache.logging.log4j.b.c;
                    this.m.add("Invalid status specified: " + (String)entry.getValue() + ". Defaulting to ERROR");
                    continue;
                }
                if ("dest".equalsIgnoreCase((String)entry.getKey())) {
                    String string = (String)entry.getValue();
                    if (string == null) continue;
                    if (string.equalsIgnoreCase("err")) {
                        printStream = System.err;
                        continue;
                    }
                    try {
                        String[] arrstring = org.apache.logging.log4j.core.d.m.a(new URI(string));
                        String string2 = Charset.defaultCharset().name();
                        printStream = new PrintStream((OutputStream)new FileOutputStream((File)arrstring), true, string2);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        System.err.println("Unable to write to " + string + ". Writing to stdout");
                    }
                    continue;
                }
                if ("shutdownHook".equalsIgnoreCase((String)entry.getKey())) {
                    String string = this.l().a((String)entry.getValue());
                    this.f = !string.equalsIgnoreCase("disable");
                    continue;
                }
                if ("verbose".equalsIgnoreCase((String)entry.getKey())) {
                    bl2 = Boolean.parseBoolean(this.l().a((String)entry.getValue()));
                    continue;
                }
                if ("packages".equalsIgnoreCase((String)entry.getKey())) {
                    String[] arrstring;
                    for (String string : arrstring = this.l().a((String)entry.getValue()).split(",")) {
                        PluginManager.a(string);
                    }
                    continue;
                }
                if ("name".equalsIgnoreCase((String)entry.getKey())) {
                    this.b(this.l().a((String)entry.getValue()));
                    continue;
                }
                if ("monitorInterval".equalsIgnoreCase((String)entry.getKey())) {
                    int n2 = Integer.parseInt(this.l().a((String)entry.getValue()));
                    if (n2 <= 0 || this.n == null) continue;
                    this.d = new q(this, this.n, this.c, n2);
                    continue;
                }
                if (!"advertiser".equalsIgnoreCase((String)entry.getKey())) continue;
                this.a(this.l().a((String)entry.getValue()), h2, arrby, "application/json");
            }
            Iterator iterator = ((org.apache.logging.log4j.d.d)a).m();
            boolean bl3 = false;
            while (iterator.hasNext()) {
                org.apache.logging.log4j.d.c c2 = (org.apache.logging.log4j.d.c)iterator.next();
                if (!(c2 instanceof a)) continue;
                bl3 = true;
                ((a)c2).a((b)((Object)object));
                if (bl2) continue;
                ((a)c2).a(i);
            }
            if (!bl3 && object != org.apache.logging.log4j.b.a) {
                a a2 = new a((b)((Object)object), printStream);
                if (!bl2) {
                    a2.a(i);
                }
                ((org.apache.logging.log4j.d.d)a).a(a2);
                for (String string2 : this.m) {
                    a.b(string2);
                }
            }
            if (this.j() == null) {
                this.b(h2.b());
            }
        }
        catch (Exception exception) {
            a.b("Error parsing " + h2.b(), (Throwable)exception);
            exception.printStackTrace();
        }
    }

    @Override
    public void e() {
        super.e();
    }

    @Override
    public void g() {
        Iterator iterator = this.l.fields();
        List list = this.b.b();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object object = (JsonNode)entry.getValue();
            if (object.isObject()) {
                a.a("Processing node for object " + (String)entry.getKey());
                list.add(this.a((String)entry.getKey(), this.b, (JsonNode)object));
                continue;
            }
            if (!object.isArray()) continue;
            a.b("Arrays are not supported at the root configuration.");
        }
        a.a("Completed parsing configuration");
        if (this.k.size() > 0) {
            for (Object object : this.k) {
                a.b("Error processing element " + t.a((t)object) + ": " + (Object)((Object)t.b((t)object)));
            }
            return;
        }
    }

    @Override
    public d q() {
        if (this.n != null) {
            try {
                h h2 = new h((InputStream)new FileInputStream(this.n), this.n);
                return new r(h2);
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.b("Cannot locate file " + this.n, (Throwable)fileNotFoundException);
            }
        }
        return null;
    }

    private y a(String string, y y2, JsonNode jsonNode) {
        Object object;
        Object object2;
        k k2 = this.g.b(string);
        y y3 = new y(y2, string, k2);
        this.a(y3, jsonNode);
        Iterator iterator = jsonNode.fields();
        List list = y3.b();
        while (iterator.hasNext()) {
            object2 = (Map.Entry)iterator.next();
            object = (JsonNode)object2.getValue();
            if (!object.isArray() && !object.isObject()) continue;
            if (k2 == null) {
                this.k.add(new t(this, string, (JsonNode)object, s.a));
            }
            if (object.isArray()) {
                a.a("Processing node for array " + (String)object2.getKey());
                for (int i2 = 0; i2 < object.size(); ++i2) {
                    String string2 = this.a(object.get(i2), (String)object2.getKey());
                    k k3 = this.g.b(string2);
                    y y4 = new y(y3, (String)object2.getKey(), k3);
                    this.a(y4, object.get(i2));
                    if (string2.equals(object2.getKey())) {
                        a.a("Processing " + (String)object2.getKey() + "[" + i2 + "]");
                    } else {
                        a.a("Processing " + string2 + " " + (String)object2.getKey() + "[" + i2 + "]");
                    }
                    Iterator iterator2 = object.get(i2).fields();
                    List list2 = y4.b();
                    while (iterator2.hasNext()) {
                        Map.Entry entry = (Map.Entry)iterator2.next();
                        if (!((JsonNode)entry.getValue()).isObject()) continue;
                        a.a("Processing node for object " + (String)entry.getKey());
                        list2.add(this.a((String)entry.getKey(), y4, (JsonNode)entry.getValue()));
                    }
                    list.add(y4);
                }
                continue;
            }
            a.a("Processing node for object " + (String)object2.getKey());
            list.add(this.a((String)object2.getKey(), y3, (JsonNode)object));
        }
        object2 = k2 == null ? "null" : k2.b() + ":" + k2.a();
        object = y3.e() == null ? "null" : (y3.e().f() == null ? "root" : y3.e().f());
        a.a("Returning " + y3.f() + " with parent " + (String)object + " of type " + (String)object2);
        return y3;
    }

    private String a(JsonNode jsonNode, String string) {
        Iterator iterator = jsonNode.fields();
        while (iterator.hasNext()) {
            JsonNode jsonNode2;
            Map.Entry entry = (Map.Entry)iterator.next();
            if (!((String)entry.getKey()).equalsIgnoreCase("type") || !(jsonNode2 = (JsonNode)entry.getValue()).isValueNode()) continue;
            return jsonNode2.asText();
        }
        return string;
    }

    private void a(y y2, JsonNode jsonNode) {
        Map map = y2.a();
        Iterator iterator = jsonNode.fields();
        while (iterator.hasNext()) {
            JsonNode jsonNode2;
            Map.Entry entry = (Map.Entry)iterator.next();
            if (((String)entry.getKey()).equalsIgnoreCase("type") || !(jsonNode2 = (JsonNode)entry.getValue()).isValueNode()) continue;
            map.put(entry.getKey(), jsonNode2.asText());
        }
    }

    protected byte[] a(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[16384];
        while ((n2 = inputStream.read(arrby, 0, arrby.length)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        return byteArrayOutputStream.toByteArray();
    }
}


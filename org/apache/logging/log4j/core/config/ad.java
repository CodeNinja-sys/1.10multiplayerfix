/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.ac;
import org.apache.logging.log4j.core.config.ae;
import org.apache.logging.log4j.core.config.af;
import org.apache.logging.log4j.core.config.c;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.apache.logging.log4j.core.config.plugins.k;
import org.apache.logging.log4j.core.config.plugins.n;
import org.apache.logging.log4j.core.config.q;
import org.apache.logging.log4j.core.config.y;
import org.apache.logging.log4j.core.d.m;
import org.apache.logging.log4j.d.a;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ad
extends c
implements ac {
    private static final String i = "http://apache.org/xml/features/xinclude/fixup-language";
    private static final String j = "http://apache.org/xml/features/xinclude/fixup-base-uris";
    private static final String[] k = new String[]{n.class.getName()};
    private static final String l = "Log4j-config.xsd";
    private static final int m = 16384;
    private final List n = new ArrayList();
    private Element o;
    private boolean p;
    private String q;
    private final File r;

    static DocumentBuilder r() {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        ad.a(documentBuilderFactory);
        return documentBuilderFactory.newDocumentBuilder();
    }

    private static void a(DocumentBuilderFactory documentBuilderFactory) {
        try {
            documentBuilderFactory.setXIncludeAware(true);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            a.f("The DocumentBuilderFactory does not support XInclude: " + documentBuilderFactory, (Throwable)unsupportedOperationException);
        }
        catch (AbstractMethodError abstractMethodError) {
            a.f("The DocumentBuilderFactory is out of date and does not support XInclude: " + documentBuilderFactory);
        }
        try {
            documentBuilderFactory.setFeature(j, true);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            a.f("The DocumentBuilderFactory [" + documentBuilderFactory + "] does not support the feature [" + j + "]", (Throwable)parserConfigurationException);
        }
        catch (AbstractMethodError abstractMethodError) {
            a.f("The DocumentBuilderFactory is out of date and does not support setFeature: " + documentBuilderFactory);
        }
        try {
            documentBuilderFactory.setFeature(i, true);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            a.f("The DocumentBuilderFactory [" + documentBuilderFactory + "] does not support the feature [" + i + "]", (Throwable)parserConfigurationException);
        }
        catch (AbstractMethodError abstractMethodError) {
            a.f("The DocumentBuilderFactory is out of date and does not support setFeature: " + documentBuilderFactory);
        }
    }

    public ad(h h2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        this.r = h2.a();
        byte[] arrby = null;
        try {
            String string;
            String[] arrstring;
            object5 = new ArrayList();
            object4 = h2.c();
            arrby = this.a((InputStream)object4);
            ((InputStream)object4).close();
            object3 = new InputSource(new ByteArrayInputStream(arrby));
            object2 = ad.r().parse((InputSource)object3);
            this.o = object2.getDocumentElement();
            object = this.b(this.b, this.o);
            b b2 = this.h();
            boolean bl2 = false;
            PrintStream printStream = System.out;
            for (Map.Entry entry : object.entrySet()) {
                if ("status".equalsIgnoreCase((String)entry.getKey())) {
                    b b3 = org.apache.logging.log4j.b.a(this.l().a((String)entry.getValue()), null);
                    if (b3 != null) {
                        b2 = b3;
                        continue;
                    }
                    object5.add("Invalid status specified: " + (String)entry.getValue() + ". Defaulting to " + (Object)((Object)b2));
                    continue;
                }
                if ("dest".equalsIgnoreCase((String)entry.getKey())) {
                    String string2 = this.l().a((String)entry.getValue());
                    if (string2 == null) continue;
                    if (string2.equalsIgnoreCase("err")) {
                        printStream = System.err;
                        continue;
                    }
                    try {
                        arrstring = org.apache.logging.log4j.core.d.m.a(new URI(string2));
                        string = Charset.defaultCharset().name();
                        printStream = new PrintStream((OutputStream)new FileOutputStream((File)arrstring), true, string);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        System.err.println("Unable to write to " + string2 + ". Writing to stdout");
                    }
                    continue;
                }
                if ("shutdownHook".equalsIgnoreCase((String)entry.getKey())) {
                    String string3 = this.l().a((String)entry.getValue());
                    this.f = !string3.equalsIgnoreCase("disable");
                    continue;
                }
                if ("verbose".equalsIgnoreCase((String)entry.getKey())) {
                    bl2 = Boolean.parseBoolean(this.l().a((String)entry.getValue()));
                    continue;
                }
                if ("packages".equalsIgnoreCase(this.l().a((String)entry.getKey()))) {
                    String[] arrstring2;
                    for (String string4 : arrstring2 = ((String)entry.getValue()).split(",")) {
                        PluginManager.a(string4);
                    }
                    continue;
                }
                if ("name".equalsIgnoreCase((String)entry.getKey())) {
                    this.b(this.l().a((String)entry.getValue()));
                    continue;
                }
                if ("strict".equalsIgnoreCase((String)entry.getKey())) {
                    this.p = Boolean.parseBoolean(this.l().a((String)entry.getValue()));
                    continue;
                }
                if ("schema".equalsIgnoreCase((String)entry.getKey())) {
                    this.q = this.l().a((String)entry.getValue());
                    continue;
                }
                if ("monitorInterval".equalsIgnoreCase((String)entry.getKey())) {
                    int n2 = Integer.parseInt(this.l().a((String)entry.getValue()));
                    if (n2 <= 0 || this.r == null) continue;
                    this.d = new q(this, this.r, this.c, n2);
                    continue;
                }
                if (!"advertiser".equalsIgnoreCase((String)entry.getKey())) continue;
                this.a(this.l().a((String)entry.getValue()), h2, arrby, "text/xml");
            }
            Iterator iterator = ((org.apache.logging.log4j.d.d)a).m();
            boolean bl3 = false;
            while (iterator.hasNext()) {
                org.apache.logging.log4j.d.c c2 = (org.apache.logging.log4j.d.c)iterator.next();
                if (!(c2 instanceof a)) continue;
                bl3 = true;
                ((a)c2).a(b2);
                if (bl2) continue;
                ((a)c2).a(k);
            }
            if (!bl3 && b2 != org.apache.logging.log4j.b.a) {
                a a2 = new a(b2, printStream);
                if (!bl2) {
                    a2.a(k);
                }
                ((org.apache.logging.log4j.d.d)a).a(a2);
                arrstring = object5.iterator();
                while (arrstring.hasNext()) {
                    string = (String)arrstring.next();
                    a.b(string);
                }
            }
        }
        catch (SAXException sAXException) {
            a.b("Error parsing " + h2.b(), (Throwable)sAXException);
        }
        catch (IOException iOException) {
            a.b("Error parsing " + h2.b(), (Throwable)iOException);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            a.b("Error parsing " + h2.b(), (Throwable)parserConfigurationException);
        }
        if (this.p && this.q != null && arrby != null) {
            object5 = null;
            try {
                object5 = this.getClass().getClassLoader().getResourceAsStream(this.q);
            }
            catch (Exception exception) {
                a.b("Unable to access schema " + this.q);
            }
            if (object5 != null) {
                object4 = new StreamSource((InputStream)object5, l);
                object3 = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
                object2 = null;
                try {
                    object2 = ((SchemaFactory)object3).newSchema((Source)object4);
                }
                catch (SAXException sAXException) {
                    a.b("Error parsing Log4j schema", (Throwable)sAXException);
                }
                if (object2 != null) {
                    object = ((Schema)object2).newValidator();
                    try {
                        ((Validator)object).validate(new StreamSource(new ByteArrayInputStream(arrby)));
                    }
                    catch (IOException iOException) {
                        a.b("Error reading configuration for validation", (Throwable)iOException);
                    }
                    catch (SAXException sAXException) {
                        a.b("Error validating configuration", (Throwable)sAXException);
                    }
                }
            }
        }
        if (this.j() == null) {
            this.b(h2.b());
        }
    }

    @Override
    public void g() {
        if (this.o == null) {
            a.b("No logging configuration");
            return;
        }
        this.a(this.b, this.o);
        if (this.n.size() > 0) {
            for (af af2 : this.n) {
                a.b("Error processing element " + af.a(af2) + ": " + (Object)((Object)af.b(af2)));
            }
            return;
        }
        this.o = null;
    }

    @Override
    public d q() {
        if (this.r != null) {
            try {
                h h2 = new h((InputStream)new FileInputStream(this.r), this.r);
                return new ad(h2);
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.b("Cannot locate file " + this.r, (Throwable)fileNotFoundException);
            }
        }
        return null;
    }

    private void a(y y2, Element element) {
        this.b(y2, element);
        StringBuilder stringBuilder = new StringBuilder();
        NodeList nodeList = element.getChildNodes();
        List list = y2.b();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node;
            Node node2 = nodeList.item(i2);
            if (node2 instanceof Element) {
                node = (Element)node2;
                String string = this.a((Element)node);
                k k2 = this.g.b(string);
                y y3 = new y(y2, string, k2);
                this.a(y3, (Element)node);
                if (k2 == null) {
                    String string2 = y3.d();
                    if (!y3.c() && string2 != null) {
                        y2.a().put(string, string2);
                        continue;
                    }
                    this.n.add(new af(this, string, element, ae.a));
                    continue;
                }
                list.add(y3);
                continue;
            }
            if (!(node2 instanceof Text)) continue;
            node = (Text)node2;
            stringBuilder.append(node.getData());
        }
        String string = stringBuilder.toString().trim();
        if (string.length() > 0 || !y2.c() && !y2.g()) {
            y2.a(string);
        }
    }

    private String a(Element element) {
        if (this.p) {
            NamedNodeMap namedNodeMap = element.getAttributes();
            for (int i2 = 0; i2 < namedNodeMap.getLength(); ++i2) {
                Attr attr;
                Node node = namedNodeMap.item(i2);
                if (!(node instanceof Attr) || !(attr = (Attr)node).getName().equalsIgnoreCase("type")) continue;
                String string = attr.getValue();
                namedNodeMap.removeNamedItem(attr.getName());
                return string;
            }
        }
        return element.getTagName();
    }

    private byte[] a(InputStream inputStream) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[16384];
        while ((n2 = inputStream.read(arrby, 0, arrby.length)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private Map b(y y2, Element element) {
        NamedNodeMap namedNodeMap = element.getAttributes();
        Map map = y2.a();
        for (int i2 = 0; i2 < namedNodeMap.getLength(); ++i2) {
            Attr attr;
            Node node = namedNodeMap.item(i2);
            if (!(node instanceof Attr) || (attr = (Attr)node).getName().equals("xml:base")) continue;
            map.put(attr.getName(), attr.getValue());
        }
        return map;
    }
}


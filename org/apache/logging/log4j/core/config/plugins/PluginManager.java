/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.logging.log4j.core.config.plugins.c;
import org.apache.logging.log4j.core.config.plugins.i;
import org.apache.logging.log4j.core.config.plugins.k;
import org.apache.logging.log4j.core.config.plugins.n;
import org.apache.logging.log4j.core.config.plugins.u;
import org.apache.logging.log4j.core.d.h;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.d;

public class PluginManager {
    private static final long a = 1000000000L;
    private static ConcurrentMap b = new ConcurrentHashMap();
    private static final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private static final String d = "org/apache/logging/log4j/core/config/plugins/";
    private static final String e = "Log4j2Plugins.dat";
    private static final String f = "org.apache.logging.log4j.core";
    private static final d g = org.apache.logging.log4j.d.d.k();
    private static String h;
    private Map i = new HashMap();
    private final String j;
    private final Class k;

    public PluginManager(String string) {
        this.j = string;
        this.k = null;
    }

    public PluginManager(String string, Class class_) {
        this.j = string;
        this.k = class_;
    }

    public static void main(String[] arrstring) {
        if (arrstring == null || arrstring.length < 1) {
            System.err.println("A target directory must be specified");
            System.exit(-1);
        }
        h = arrstring[0].endsWith("/") || arrstring[0].endsWith("\\") ? arrstring[0] : arrstring[0] + "/";
        PluginManager pluginManager = new PluginManager("Core");
        String string = arrstring.length == 2 ? arrstring[1] : null;
        pluginManager.a(false, string);
        PluginManager.a(b);
    }

    public static void a(String string) {
        if (c.addIfAbsent(string)) {
            b.clear();
        }
    }

    public k b(String string) {
        return (k)this.i.get(string.toLowerCase());
    }

    public Map a() {
        return this.i;
    }

    public void b() {
        this.a(true, null);
    }

    public void a(boolean bl2, String string) {
        Object object2;
        if (b.containsKey(this.j)) {
            this.i = (Map)b.get(this.j);
            bl2 = false;
        }
        long l2 = System.nanoTime();
        n n2 = new n();
        ClassLoader classLoader = p.a();
        if (classLoader != null) {
            n2.a(classLoader);
        }
        if (bl2) {
            object2 = PluginManager.a(classLoader);
            if (object2 != null) {
                b = object2;
                this.i = (Map)object2.get(this.j);
            } else {
                g.f("Plugin preloads not available from class loader {}", classLoader);
            }
        }
        if (this.i == null || this.i.size() == 0) {
            if (string == null) {
                if (!c.contains(f)) {
                    c.add(f);
                }
            } else {
                object2 = string.split(",");
                for (String object3 : object2) {
                    c.add(object3);
                }
            }
        }
        object2 = new i(this.k);
        for (String string2 : c) {
            n2.a((u)object2, string2);
        }
        for (Class class_ : n2.a()) {
            c c2 = class_.getAnnotation(c.class);
            String string2 = c2.b();
            if (!b.containsKey(string2)) {
                b.putIfAbsent(string2, new ConcurrentHashMap());
            }
            Map map = (Map)b.get(string2);
            String string3 = c2.c().equals("") ? c2.a() : c2.c();
            k k2 = new k(class_, string3, c2.d(), c2.e());
            map.put(c2.a().toLowerCase(), k2);
            org.apache.logging.log4j.core.config.plugins.d d2 = class_.getAnnotation(org.apache.logging.log4j.core.config.plugins.d.class);
            if (d2 == null) continue;
            for (String string4 : d2.a()) {
                string3 = c2.c().equals("") ? string4 : c2.c();
                k2 = new k(class_, string3, c2.d(), c2.e());
                map.put(string4.trim().toLowerCase(), k2);
            }
        }
        long l3 = System.nanoTime() - l2;
        this.i = (Map)b.get(this.j);
        StringBuilder stringBuilder = new StringBuilder("Generated plugins");
        stringBuilder.append(" in ");
        DecimalFormat decimalFormat = new DecimalFormat("#0");
        long l4 = l3 / 1000000000L;
        stringBuilder.append(decimalFormat.format(l4)).append('.');
        DecimalFormat decimalFormat2 = new DecimalFormat("000000000");
        stringBuilder.append(decimalFormat2.format(l3 %= 1000000000L)).append(" seconds");
        g.a(stringBuilder.toString());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ConcurrentMap a(ClassLoader classLoader) {
        Enumeration<URL> enumeration;
        try {
            enumeration = classLoader.getResources("org/apache/logging/log4j/core/config/plugins/Log4j2Plugins.dat");
        }
        catch (IOException iOException) {
            g.f("Unable to preload plugins", (Throwable)iOException);
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        while (enumeration.hasMoreElements()) {
            InputStream inputStream;
            DataInputStream dataInputStream = null;
            try {
                URL uRL = enumeration.nextElement();
                g.a("Found Plugin Map at {}", uRL.toExternalForm());
                inputStream = uRL.openStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                dataInputStream = new DataInputStream(bufferedInputStream);
                int n2 = dataInputStream.readInt();
                for (int i2 = 0; i2 < n2; ++i2) {
                    String string = dataInputStream.readUTF();
                    int n3 = dataInputStream.readInt();
                    ConcurrentHashMap<String, k> concurrentHashMap2 = (ConcurrentHashMap<String, k>)concurrentHashMap.get(string);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap<String, k>(n2);
                    }
                    for (int i3 = 0; i3 < n3; ++i3) {
                        String string2 = dataInputStream.readUTF();
                        String string3 = dataInputStream.readUTF();
                        String string4 = dataInputStream.readUTF();
                        boolean bl2 = dataInputStream.readBoolean();
                        boolean bl3 = dataInputStream.readBoolean();
                        Class<?> class_ = Class.forName(string3);
                        concurrentHashMap2.put(string2, new k(class_, string4, bl2, bl3));
                    }
                    concurrentHashMap.putIfAbsent(string, concurrentHashMap2);
                }
                org.apache.logging.log4j.core.d.h.a(dataInputStream);
            }
            catch (Exception exception) {
                g.f("Unable to preload plugins", (Throwable)exception);
                inputStream = null;
                return inputStream;
            }
            finally {
                org.apache.logging.log4j.core.d.h.a(dataInputStream);
            }
        }
        return concurrentHashMap.size() == 0 ? null : concurrentHashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(ConcurrentMap concurrentMap) {
        String string = h + d + e;
        DataOutputStream dataOutputStream = null;
        try {
            File file = new File(h + d);
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            dataOutputStream = new DataOutputStream(bufferedOutputStream);
            dataOutputStream.writeInt(concurrentMap.size());
            for (Map.Entry entry : concurrentMap.entrySet()) {
                dataOutputStream.writeUTF((String)entry.getKey());
                dataOutputStream.writeInt(((ConcurrentMap)entry.getValue()).size());
                for (Map.Entry entry2 : ((ConcurrentMap)entry.getValue()).entrySet()) {
                    dataOutputStream.writeUTF((String)entry2.getKey());
                    k k2 = (k)entry2.getValue();
                    dataOutputStream.writeUTF(k2.a().getName());
                    dataOutputStream.writeUTF(k2.b());
                    dataOutputStream.writeBoolean(k2.c());
                    dataOutputStream.writeBoolean(k2.d());
                }
            }
            org.apache.logging.log4j.core.d.h.a(dataOutputStream);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            org.apache.logging.log4j.core.d.h.a(dataOutputStream);
        }
    }
}


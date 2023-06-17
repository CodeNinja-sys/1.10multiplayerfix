/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.logging.log4j.core.config.aa;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.config.i;
import org.apache.logging.log4j.core.config.j;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.apache.logging.log4j.core.config.plugins.k;
import org.apache.logging.log4j.core.d.m;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.core.h.n;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.e.b;

public abstract class f {
    public static final String a = "log4j.configurationFactory";
    public static final String b = "log4j.configurationFile";
    protected static final d c = org.apache.logging.log4j.d.d.k();
    protected static final String d = "log4j2-test";
    protected static final String e = "log4j2";
    private static final String g = "classloader";
    private static final int h = "classloader".length() + 1;
    private static final String i = "classpath";
    private static final int j = "classpath".length() + 1;
    private static volatile List k = null;
    private static f l = new i(null);
    protected final n f = new n(new org.apache.logging.log4j.core.h.d());

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static f a() {
        if (k != null) return l;
        String string = d;
        synchronized (d) {
            if (k != null) return l;
            ArrayList arrayList = new ArrayList();
            String string2 = org.apache.logging.log4j.e.b.a().a(a);
            if (string2 != null) {
                org.apache.logging.log4j.core.config.f.a(arrayList, string2);
            }
            PluginManager pluginManager = new PluginManager("ConfigurationFactory");
            pluginManager.b();
            Map map = pluginManager.a();
            TreeSet<j> treeSet = new TreeSet<j>();
            for (k k2 : map.values()) {
                try {
                    Class class_ = k2.a();
                    aa aa2 = class_.getAnnotation(aa.class);
                    if (aa2 == null) continue;
                    int n2 = aa2.a();
                    treeSet.add(new j(n2, class_));
                }
                catch (Exception exception) {
                    c.f("Unable to add class " + k2.a());
                }
            }
            for (j j2 : treeSet) {
                org.apache.logging.log4j.core.config.f.a(arrayList, org.apache.logging.log4j.core.config.j.b(j2));
            }
            k = Collections.unmodifiableList(arrayList);
            // ** MonitorExit[var0] (shouldn't be in output)
            return l;
        }
    }

    private static void a(List list, String string) {
        try {
            org.apache.logging.log4j.core.config.f.a(list, Class.forName(string));
        }
        catch (ClassNotFoundException classNotFoundException) {
            c.b("Unable to load class " + string, (Throwable)classNotFoundException);
        }
        catch (Exception exception) {
            c.b("Unable to load class " + string, (Throwable)exception);
        }
    }

    private static void a(List list, Class class_) {
        try {
            list.add(class_.newInstance());
        }
        catch (Exception exception) {
            c.b("Unable to create instance of " + class_.getName(), (Throwable)exception);
        }
    }

    public static void a(f f2) {
        l = f2;
    }

    public static void b() {
        l = new i(null);
    }

    public static void b(f f2) {
        if (l == f2) {
            l = new i(null);
        }
    }

    protected abstract String[] c();

    protected boolean d() {
        return true;
    }

    public abstract org.apache.logging.log4j.core.config.d a(h var1);

    public org.apache.logging.log4j.core.config.d a(String string, URI uRI) {
        h h2;
        if (!this.d()) {
            return null;
        }
        if (uRI != null && (h2 = this.a(uRI)) != null) {
            return this.a(h2);
        }
        return null;
    }

    protected h a(URI uRI) {
        ClassLoader classLoader;
        String string;
        h h2;
        boolean bl2;
        String string2;
        File file = m.a(uRI);
        if (file != null && file.exists() && file.canRead()) {
            try {
                return new h((InputStream)new FileInputStream(file), file);
            }
            catch (FileNotFoundException fileNotFoundException) {
                c.b("Cannot locate file " + uRI.getPath(), (Throwable)fileNotFoundException);
            }
        }
        boolean bl3 = (string2 = uRI.getScheme()) != null && string2.equals("classloader");
        boolean bl4 = bl2 = string2 != null && !bl3 && string2.equals("classpath");
        if ((string2 == null || bl3 || bl2) && (h2 = this.b(string = bl3 ? uRI.toString().substring(h) : (bl2 ? uRI.toString().substring(j) : uRI.getPath()), classLoader = this.getClass().getClassLoader())) != null) {
            return h2;
        }
        try {
            return new h(uRI.toURL().openStream(), uRI.getPath());
        }
        catch (MalformedURLException malformedURLException) {
            c.b("Invalid URL " + uRI.toString(), (Throwable)malformedURLException);
        }
        catch (IOException iOException) {
            c.b("Unable to access " + uRI.toString(), (Throwable)iOException);
        }
        catch (Exception exception) {
            c.b("Unable to access " + uRI.toString(), (Throwable)exception);
        }
        return null;
    }

    protected h a(String string, ClassLoader classLoader) {
        try {
            URL uRL = new URL(string);
            return new h(uRL.openStream(), m.a(uRL.toURI()));
        }
        catch (Exception exception) {
            h h2 = this.b(string, classLoader);
            if (h2 == null) {
                try {
                    File file = new File(string);
                    return new h((InputStream)new FileInputStream(file), file);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    // empty catch block
                }
            }
            return h2;
        }
    }

    protected h b(String string, ClassLoader classLoader) {
        URL uRL = p.a(string, classLoader);
        if (uRL == null) {
            return null;
        }
        InputStream inputStream = null;
        try {
            inputStream = uRL.openStream();
        }
        catch (IOException iOException) {
            return null;
        }
        if (inputStream == null) {
            return null;
        }
        if (m.a(uRL)) {
            try {
                return new h(inputStream, m.a(uRL.toURI()));
            }
            catch (URISyntaxException uRISyntaxException) {
                // empty catch block
            }
        }
        return new h(inputStream, string);
    }

    static /* synthetic */ List e() {
        return k;
    }
}


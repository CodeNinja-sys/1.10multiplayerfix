/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.osgi.framework.FrameworkUtil
 *  org.osgi.framework.wiring.BundleWiring
 */
package org.apache.logging.log4j.core.config.plugins;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import org.apache.logging.log4j.core.config.plugins.o;
import org.apache.logging.log4j.core.config.plugins.q;
import org.apache.logging.log4j.core.config.plugins.r;
import org.apache.logging.log4j.core.config.plugins.s;
import org.apache.logging.log4j.core.config.plugins.u;
import org.apache.logging.log4j.core.d.e;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.d;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;

public class n {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private static final String b = "vfszip";
    private static final String c = "bundleresource";
    private final Set d = new HashSet();
    private final Set e = new HashSet();
    private ClassLoader f;

    public Set a() {
        return this.d;
    }

    public Set b() {
        return this.e;
    }

    public ClassLoader c() {
        return this.f != null ? this.f : (this.f = p.a(n.class, null));
    }

    public void a(ClassLoader classLoader) {
        this.f = classLoader;
    }

    public void a(Class class_, String ... arrstring) {
        if (arrstring == null) {
            return;
        }
        q q2 = new q(class_);
        for (String string : arrstring) {
            this.a((u)q2, string);
        }
    }

    public void a(String string, String ... arrstring) {
        if (arrstring == null) {
            return;
        }
        r r2 = new r(string);
        for (String string2 : arrstring) {
            this.a((u)r2, string2);
        }
    }

    public void b(Class class_, String ... arrstring) {
        if (arrstring == null) {
            return;
        }
        o o2 = new o(class_);
        for (String string : arrstring) {
            this.a((u)o2, string);
        }
    }

    public void b(String string, String ... arrstring) {
        if (arrstring == null) {
            return;
        }
        s s2 = new s(string);
        for (String string2 : arrstring) {
            this.a((u)s2, string2);
        }
    }

    public void a(u u2, String ... arrstring) {
        if (arrstring == null) {
            return;
        }
        for (String string : arrstring) {
            this.a(u2, string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(u u2, String string) {
        Enumeration<URL> enumeration;
        string = string.replace('.', '/');
        ClassLoader classLoader = this.c();
        try {
            enumeration = classLoader.getResources(string);
        }
        catch (IOException iOException) {
            a.f("Could not read package: " + string, (Throwable)iOException);
            return;
        }
        while (enumeration.hasMoreElements()) {
            try {
                Object object;
                URL uRL = enumeration.nextElement();
                String string2 = uRL.getFile();
                string2 = URLDecoder.decode(string2, org.apache.logging.log4j.core.d.e.a.name());
                if (string2.startsWith("file:")) {
                    string2 = string2.substring(5);
                }
                if (string2.indexOf(33) > 0) {
                    string2 = string2.substring(0, string2.indexOf(33));
                }
                a.d("Scanning for classes in [" + string2 + "] matching criteria: " + u2);
                if (b.equals(uRL.getProtocol())) {
                    object = string2.substring(0, string2.length() - string.length() - 2);
                    URL uRL2 = new URL(uRL.getProtocol(), uRL.getHost(), (String)object);
                    JarInputStream jarInputStream = new JarInputStream(uRL2.openStream());
                    try {
                        this.a(u2, string, (String)object, jarInputStream);
                        continue;
                    }
                    finally {
                        this.a(jarInputStream, uRL2);
                        continue;
                    }
                }
                if (c.equals(uRL.getProtocol())) {
                    this.c(u2, string);
                    continue;
                }
                object = new File(string2);
                if (((File)object).isDirectory()) {
                    this.a(u2, string, (File)object);
                    continue;
                }
                this.b(u2, string, (File)object);
            }
            catch (IOException iOException) {
                a.f("could not read entries", (Throwable)iOException);
            }
        }
    }

    private void c(u u2, String string) {
        BundleWiring bundleWiring = (BundleWiring)FrameworkUtil.getBundle(n.class).adapt(BundleWiring.class);
        Collection collection = bundleWiring.listResources(string, "*.class", 1);
        for (String string2 : collection) {
            this.b(u2, string2);
        }
    }

    private void a(u u2, String string, File file) {
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return;
        }
        for (File file2 : arrfile) {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string).append("/").append(file2.getName());
            String string3 = string2 = string == null ? file2.getName() : stringBuilder.toString();
            if (file2.isDirectory()) {
                this.a(u2, string2, file2);
                continue;
            }
            if (!this.d(u2, file2.getName())) continue;
            this.b(u2, string2);
        }
    }

    private boolean d(u u2, String string) {
        return u2.b() || string.endsWith(".class") && u2.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void b(u u2, String string, File file) {
        JarInputStream jarInputStream = null;
        try {
            jarInputStream = new JarInputStream(new FileInputStream(file));
            this.a(u2, string, file.getPath(), jarInputStream);
            this.a(jarInputStream, file);
            return;
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.b("Could not search jar file '" + file + "' for classes matching criteria: " + u2 + " file not found");
            this.a(jarInputStream, file);
            return;
            {
                catch (Throwable throwable) {
                    this.a(jarInputStream, file);
                    throw throwable;
                }
            }
            catch (IOException iOException) {
                a.b("Could not search jar file '" + file + "' for classes matching criteria: " + u2 + " due to an IOException", (Throwable)iOException);
                this.a(jarInputStream, file);
                return;
            }
        }
    }

    private void a(JarInputStream jarInputStream, Object object) {
        if (jarInputStream != null) {
            try {
                jarInputStream.close();
            }
            catch (IOException iOException) {
                a.b("Error closing JAR file stream for {}", object, iOException);
            }
        }
    }

    private void a(u u2, String string, String string2, JarInputStream jarInputStream) {
        try {
            JarEntry jarEntry;
            while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
                String string3 = jarEntry.getName();
                if (jarEntry.isDirectory() || !string3.startsWith(string) || !this.d(u2, string3)) continue;
                this.b(u2, string3);
            }
        }
        catch (IOException iOException) {
            a.b("Could not search jar file '" + string2 + "' for classes matching criteria: " + u2 + " due to an IOException", (Throwable)iOException);
        }
    }

    protected void b(u u2, String string) {
        try {
            Object object;
            ClassLoader classLoader = this.c();
            if (u2.a()) {
                Class<?> class_;
                object = string.substring(0, string.indexOf(46)).replace('/', '.');
                if (a.e()) {
                    a.a("Checking to see if class " + (String)object + " matches criteria [" + u2 + "]");
                }
                if (u2.a(class_ = classLoader.loadClass((String)object))) {
                    this.d.add(class_);
                }
            }
            if (u2.b()) {
                object = classLoader.getResource(string);
                if (object == null) {
                    object = classLoader.getResource(string.substring(1));
                }
                if (object != null && u2.a(((URL)object).toURI())) {
                    this.e.add(((URL)object).toURI());
                }
            }
        }
        catch (Throwable throwable) {
            a.f("Could not examine class '" + string + "' due to a " + throwable.getClass().getName() + " with message: " + throwable.getMessage());
        }
    }
}


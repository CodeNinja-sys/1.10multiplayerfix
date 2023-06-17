/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.d.aad;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.d.me;
import com.a.a.d.mf;
import com.a.a.d.yd;
import com.a.a.m.b;
import com.a.a.m.e;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

final class f {
    private final mf a = new mf(yd.f());
    private final Set b = aad.a();

    f() {
    }

    me a() {
        return this.a.c();
    }

    void a(URI uRI, ClassLoader classLoader) {
        if (uRI.getScheme().equals("file") && this.b.add(uRI)) {
            this.a(new File(uRI), classLoader);
        }
    }

    void a(File file, ClassLoader classLoader) {
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            this.b(file, classLoader);
        } else {
            this.c(file, classLoader);
        }
    }

    private void b(File file, ClassLoader classLoader) {
        this.a(file, classLoader, "", lo.j());
    }

    private void a(File file, ClassLoader classLoader, String string, lo lo2) {
        File file2 = file.getCanonicalFile();
        if (lo2.contains(file2)) {
            return;
        }
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            com.a.a.m.b.d().warning("Cannot read directory " + file);
            return;
        }
        lo lo3 = lo.k().b(lo2).c(file2).b();
        for (File file3 : arrfile) {
            String string2 = file3.getName();
            if (file3.isDirectory()) {
                this.a(file3, classLoader, string + string2 + "/", lo3);
                continue;
            }
            String string3 = string + string2;
            if (string3.equals("META-INF/MANIFEST.MF")) continue;
            this.a.d(e.a(string3, classLoader));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void c(File file, ClassLoader classLoader) {
        JarFile jarFile;
        try {
            jarFile = new JarFile(file);
        }
        catch (IOException iOException) {
            return;
        }
        try {
            for (Object object : f.a(file, jarFile.getManifest())) {
                this.a((URI)object, classLoader);
            }
            Enumeration<JarEntry> enumeration = jarFile.entries();
            while (enumeration.hasMoreElements()) {
                Object object;
                object = (JarEntry)enumeration.nextElement();
                if (((ZipEntry)object).isDirectory() || ((ZipEntry)object).getName().equals("META-INF/MANIFEST.MF")) continue;
                this.a.d(e.a(((ZipEntry)object).getName(), classLoader));
            }
        }
        finally {
            try {
                jarFile.close();
            }
            catch (IOException iOException) {}
        }
    }

    static lo a(File file, Manifest manifest) {
        if (manifest == null) {
            return lo.j();
        }
        lp lp2 = lo.k();
        String string = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (string != null) {
            for (String string2 : com.a.a.m.b.e().a(string)) {
                URI uRI;
                try {
                    uRI = f.a(file, string2);
                }
                catch (URISyntaxException uRISyntaxException) {
                    com.a.a.m.b.d().warning("Invalid Class-Path entry: " + string2);
                    continue;
                }
                lp2.c(uRI);
            }
        }
        return lp2.b();
    }

    static URI a(File file, String string) {
        URI uRI = new URI(string);
        if (uRI.isAbsolute()) {
            return uRI;
        }
        return new File(file.getParentFile(), string.replace('/', File.separatorChar)).toURI();
    }
}


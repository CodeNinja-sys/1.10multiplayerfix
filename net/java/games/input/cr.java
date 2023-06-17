/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import net.java.games.input.ae;
import net.java.games.input.ct;

class cr
extends ClassLoader {
    private static String c;
    private static final FileFilter d;
    static final boolean a;
    static Class b;

    public cr() {
        super(Thread.currentThread().getContextClassLoader());
    }

    protected Class findClass(String string) {
        byte[] arrby = this.b(string);
        return this.defineClass(string, arrby, 0, arrby.length);
    }

    private byte[] b(String string) {
        if (c == null) {
            c = ae.d + File.separator + "controller";
        }
        try {
            return this.c(string);
        }
        catch (Exception exception) {
            try {
                return this.d(string);
            }
            catch (IOException iOException) {
                throw new ClassNotFoundException(string, iOException);
            }
        }
    }

    private byte[] c(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string, ".");
        StringBuffer stringBuffer = new StringBuffer(c);
        while (stringTokenizer.hasMoreTokens()) {
            stringBuffer.append(File.separator);
            stringBuffer.append(stringTokenizer.nextToken());
        }
        stringBuffer.append(".class");
        File file = new File(stringBuffer.toString());
        if (!file.exists()) {
            throw new ClassNotFoundException(string);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        if (!a && file.length() > Integer.MAX_VALUE) {
            throw new AssertionError();
        }
        int n2 = (int)file.length();
        byte[] arrby = new byte[n2];
        int n3 = fileInputStream.read(arrby);
        if (!a && n2 != n3) {
            throw new AssertionError();
        }
        return arrby;
    }

    private byte[] d(String string) {
        File file = new File(c);
        File[] arrfile = file.listFiles(d);
        if (arrfile == null) {
            throw new ClassNotFoundException("Could not find class " + string);
        }
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            JarFile jarFile = new JarFile(arrfile[i2]);
            JarEntry jarEntry = jarFile.getJarEntry(string + ".class");
            if (jarEntry == null) continue;
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            if (!a && jarEntry.getSize() > Integer.MAX_VALUE) {
                throw new AssertionError();
            }
            int n2 = (int)jarEntry.getSize();
            if (!a && n2 < 0) {
                throw new AssertionError();
            }
            byte[] arrby = new byte[n2];
            int n3 = inputStream.read(arrby);
            if (!a && n2 != n3) {
                throw new AssertionError();
            }
            return arrby;
        }
        throw new FileNotFoundException(string);
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static {
        a = !(b == null ? (b = cr.a("net.java.games.input.cr")) : b).desiredAssertionStatus();
        d = new ct(null);
    }
}


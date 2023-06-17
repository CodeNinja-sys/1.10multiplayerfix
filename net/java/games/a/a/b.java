/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.a.a;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class b
extends URLClassLoader {
    static final boolean a = false;
    File b;
    boolean c = true;
    static Class d;

    public b(File file) {
        super(new URL[]{file.toURL()}, Thread.currentThread().getContextClassLoader());
        this.b = file.getParentFile();
        if (System.getProperty("net.java.games.util.plugins.nolocalnative") != null) {
            this.c = false;
        }
    }

    protected String findLibrary(String string) {
        if (this.c) {
            String string2 = this.b.getPath() + File.separator + System.mapLibraryName(string);
            return string2;
        }
        return super.findLibrary(string);
    }

    public boolean a(Class class_) {
        return !class_.isInterface() && this.b(class_);
    }

    private boolean b(Class class_) {
        int n2;
        if (class_ == null) {
            return false;
        }
        Class<?>[] arrclass = class_.getInterfaces();
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            if (arrclass[n2] != (d == null ? net.java.games.a.a.b.a("net.java.games.a.a.a") : d)) continue;
            return true;
        }
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            if (!this.b(arrclass[n2])) continue;
            return true;
        }
        return this.b(class_.getSuperclass());
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}


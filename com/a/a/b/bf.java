/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.be;
import com.a.a.b.bh;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;

class bf
implements bh {
    private static final String a = "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.";

    bf() {
    }

    @Override
    public Class a() {
        try {
            URLClassLoader uRLClassLoader = this.a(this.b());
            return uRLClassLoader.loadClass("com.google.common.base.internal.Finalizer");
        }
        catch (Exception exception) {
            be.b().log(Level.WARNING, a, exception);
            return null;
        }
    }

    URL b() {
        String string = "com.google.common.base.internal.Finalizer".replace('.', '/') + ".class";
        URL uRL = this.getClass().getClassLoader().getResource(string);
        if (uRL == null) {
            throw new FileNotFoundException(string);
        }
        String string2 = uRL.toString();
        if (!string2.endsWith(string)) {
            throw new IOException("Unsupported path style: " + string2);
        }
        string2 = string2.substring(0, string2.length() - string.length());
        return new URL(uRL, string2);
    }

    URLClassLoader a(URL uRL) {
        return new URLClassLoader(new URL[]{uRL}, null);
    }
}


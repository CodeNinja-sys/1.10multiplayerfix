/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.be;
import com.a.a.b.bh;

class bi
implements bh {
    static boolean a;

    bi() {
    }

    @Override
    public Class a() {
        ClassLoader classLoader;
        if (a) {
            return null;
        }
        try {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        catch (SecurityException securityException) {
            be.b().info("Not allowed to access system class loader.");
            return null;
        }
        if (classLoader != null) {
            try {
                return classLoader.loadClass("com.google.common.base.internal.Finalizer");
            }
            catch (ClassNotFoundException classNotFoundException) {
                return null;
            }
        }
        return null;
    }
}


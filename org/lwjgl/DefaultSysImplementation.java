/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import org.lwjgl.af;

abstract class DefaultSysImplementation
implements af {
    DefaultSysImplementation() {
    }

    public native int getJNIVersion();

    public native int getPointerSize();

    public native void setDebug(boolean var1);

    public long a() {
        return 1000L;
    }

    public boolean b() {
        return false;
    }

    public abstract long c();

    public abstract void a(String var1, String var2);

    public abstract String d();
}


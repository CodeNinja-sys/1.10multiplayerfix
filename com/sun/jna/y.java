/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

class y {
    static Class a;
    static Class b;

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}


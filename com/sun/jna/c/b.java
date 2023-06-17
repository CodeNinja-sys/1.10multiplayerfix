/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.c;

import com.sun.jna.Native;
import com.sun.jna.aq;
import com.sun.jna.av;
import com.sun.jna.ay;
import com.sun.jna.r;
import java.lang.reflect.Method;

public class b
implements r {
    static Class a;

    protected int a(Class class_) {
        if ((a == null ? (a = b.a("com.sun.jna.au")) : a).isAssignableFrom(class_)) {
            class_ = av.a(class_).a();
        }
        if (class_.isArray()) {
            return ay.H;
        }
        try {
            return Native.f(class_);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Unknown native stack allocation size for " + class_);
        }
    }

    public String a(aq aq2, Method method) {
        String string = method.getName();
        int n2 = 0;
        Class<?>[] arrclass = method.getParameterTypes();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            n2 += this.a(arrclass[i2]);
        }
        String string2 = string + "@" + n2;
        int n3 = 1;
        try {
            string = aq2.a(string2, n3).a();
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            try {
                string = aq2.a("_" + string2, n3).a();
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError2) {
                // empty catch block
            }
        }
        return string;
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


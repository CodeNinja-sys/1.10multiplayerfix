/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import net.minecraft.q.a;
import net.minecraft.q.af;
import net.minecraft.q.e;
import net.minecraft.q.m;

public enum w {
    a(0, "Overworld", "", a.class),
    b(-1, "Nether", "_nether", af.class),
    c(1, "The End", "_end", m.class);

    private final int d;
    private final String e;
    private final String f;
    private final Class g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w(String string, Class class_) {
        void var6_4;
        void var5_3;
        this.d = (int)string;
        this.e = class_;
        this.f = var5_3;
        this.g = var6_4;
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public e d() {
        try {
            Constructor constructor = this.g.getConstructor(new Class[0]);
            return (e)constructor.newInstance(new Object[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new Error("Could not create new dimension", noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new Error("Could not create new dimension", invocationTargetException);
        }
        catch (InstantiationException instantiationException) {
            throw new Error("Could not create new dimension", instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new Error("Could not create new dimension", illegalAccessException);
        }
    }

    public static w a(int n2) {
        for (w w2 : w.values()) {
            if (w2.a() != n2) continue;
            return w2;
        }
        throw new IllegalArgumentException("Invalid dimension id " + n2);
    }
}


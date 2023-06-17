/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum cyy {
    a(0, "Overworld", "", ho.class),
    b(-1, "Nether", "_nether", cer.class),
    c(1, "The End", "_end", cup.class);

    private final int d;
    private final String e;
    private final String f;
    private final Class g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cyy(String string, Class class_) {
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

    public byf d() {
        try {
            Constructor constructor = this.g.getConstructor(new Class[0]);
            return (byf)constructor.newInstance(new Object[0]);
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

    public static cyy a(int n2) {
        for (cyy cyy2 : cyy.values()) {
            if (cyy2.a() != n2) continue;
            return cyy2;
        }
        throw new IllegalArgumentException("Invalid dimension id " + n2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class baw {
    private static baw[] l = new baw[0];
    public static final baw a = baw.a(ahq.class, "HoldingPattern");
    public static final baw b = baw.a(bie.class, "StrafePlayer");
    public static final baw c = baw.a(bhq.class, "LandingApproach");
    public static final baw d = baw.a(abw.class, "Landing");
    public static final baw e = baw.a(yv.class, "Takeoff");
    public static final baw f = baw.a(cik.class, "SittingFlaming");
    public static final baw g = baw.a(byq.class, "SittingScanning");
    public static final baw h = baw.a(cap.class, "SittingAttacking");
    public static final baw i = baw.a(adb.class, "ChargingPlayer");
    public static final baw j = baw.a(cvv.class, "Dying");
    public static final baw k = baw.a(bky.class, "Hover");
    private final Class m;
    private final int n;
    private final String o;

    private baw(int n2, Class class_, String string) {
        this.n = n2;
        this.m = class_;
        this.o = string;
    }

    public ajd a(brd brd2) {
        try {
            Constructor constructor = this.a();
            return (ajd)constructor.newInstance(brd2);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    protected Constructor a() {
        return this.m.getConstructor(brd.class);
    }

    public int b() {
        return this.n;
    }

    public String toString() {
        return this.o + " (#" + this.n + ")";
    }

    public static baw a(int n2) {
        if (n2 < 0 || n2 >= l.length) {
            return a;
        }
        return l[n2];
    }

    public static int c() {
        return l.length;
    }

    private static baw a(Class class_, String string) {
        baw baw2 = new baw(l.length, class_, string);
        l = Arrays.copyOf(l, l.length + 1);
        baw.l[baw2.b()] = baw2;
        return baw2;
    }
}


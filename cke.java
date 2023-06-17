/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.List;
import java.util.Set;
import org.lwjgl.a.g;

public class cke
implements Comparable {
    private static final List a = ov.a();
    private static final cyn b = new cyn();
    private static final Set c = aad.a();
    private final String d;
    private final int e;
    private final String f;
    private int g;
    private boolean h;
    private int i;

    public static void a(int n2) {
        if (n2 == 0) {
            return;
        }
        cke cke2 = (cke)b.a(n2);
        if (cke2 != null) {
            ++cke2.i;
        }
    }

    public static void a(int n2, boolean bl2) {
        if (n2 == 0) {
            return;
        }
        cke cke2 = (cke)b.a(n2);
        if (cke2 != null) {
            cke2.h = bl2;
        }
    }

    public static void a() {
        for (cke cke2 : a) {
            try {
                cke.a(cke2.g, org.lwjgl.a.g.a(cke2.g));
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
        }
    }

    public static void b() {
        for (cke cke2 : a) {
            cke2.k();
        }
    }

    public static void c() {
        b.a();
        for (cke cke2 : a) {
            b.a(cke2.g, cke2);
        }
    }

    public static Set d() {
        return c;
    }

    public cke(String string, int n2, String string2) {
        this.d = string;
        this.g = n2;
        this.e = n2;
        this.f = string2;
        a.add(this);
        b.a(n2, this);
        c.add(string2);
    }

    public boolean e() {
        return this.h;
    }

    public String f() {
        return this.f;
    }

    public boolean g() {
        if (this.i == 0) {
            return false;
        }
        --this.i;
        return true;
    }

    private void k() {
        this.i = 0;
        this.h = false;
    }

    public String h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public int j() {
        return this.g;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public int a(cke cke2) {
        int n2 = bf.a(this.f, new Object[0]).compareTo(bf.a(cke2.f, new Object[0]));
        if (n2 == 0) {
            n2 = bf.a(this.d, new Object[0]).compareTo(bf.a(cke2.d, new Object[0]));
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((cke)object);
    }
}


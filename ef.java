/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Collection;
import java.util.Set;

public class ef
extends ccw {
    private final bzt a;
    private final String b;
    private final Set c = aad.a();
    private String d;
    private String e = "";
    private String f = "";
    private boolean g = true;
    private boolean h = true;
    private afb i = afb.a;
    private afb j = afb.a;
    private aug k = aug.v;
    private bfo l = bfo.a;

    public ef(bzt bzt2, String string) {
        this.a = bzt2;
        this.b = string;
        this.d = string;
    }

    @Override
    public String a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public void a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.d = string;
        this.a.b(this);
    }

    @Override
    public Collection c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public void b(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.e = string;
        this.a.b(this);
    }

    public String e() {
        return this.f;
    }

    public void c(String string) {
        this.f = string;
        this.a.b(this);
    }

    @Override
    public String d(String string) {
        return this.d() + string + this.e();
    }

    public static String a(ccw ccw2, String string) {
        if (ccw2 == null) {
            return string;
        }
        return ccw2.d(string);
    }

    @Override
    public boolean f() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
        this.a.b(this);
    }

    @Override
    public boolean g() {
        return this.h;
    }

    public void b(boolean bl2) {
        this.h = bl2;
        this.a.b(this);
    }

    @Override
    public afb h() {
        return this.i;
    }

    @Override
    public afb i() {
        return this.j;
    }

    public void a(afb afb2) {
        this.i = afb2;
        this.a.b(this);
    }

    public void b(afb afb2) {
        this.j = afb2;
        this.a.b(this);
    }

    @Override
    public bfo j() {
        return this.l;
    }

    public void a(bfo bfo2) {
        this.l = bfo2;
        this.a.b(this);
    }

    public int k() {
        int n2 = 0;
        if (this.f()) {
            n2 |= 1;
        }
        if (this.g()) {
            n2 |= 2;
        }
        return n2;
    }

    public void a(int n2) {
        this.a((n2 & 1) > 0);
        this.b((n2 & 2) > 0);
    }

    public void a(aug aug2) {
        this.k = aug2;
    }

    @Override
    public aug l() {
        return this.k;
    }
}


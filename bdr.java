/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class bdr
extends cjn {
    private final n a;

    public bdr(n n2) {
        this.a = n2;
        this.y = Collections.synchronizedList(ov.a());
    }

    public n f() {
        return this.a;
    }

    @Override
    public void cH_() {
        this.a.d();
        super.cH_();
    }

    public void a(String string, int n2, int n3, int n4) {
        super.a(this.B, string, n2, n3, n4);
    }

    public void a(String string, int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            super.b(this.B, string, n2, n3, n4);
        } else {
            this.B.a(string, n2, n3, n4);
        }
    }

    @Override
    public void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
        super.c(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        super.b(n2, n3, n4, n5, n6, n7);
    }

    @Override
    public void aH_() {
        super.aH_();
    }

    @Override
    public boolean q_() {
        return super.q_();
    }

    @Override
    public void a_(int n2) {
        super.a_(n2);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.a.a(n2, n3, f2);
    }

    @Override
    public void a(bhl bhl2, int n2, int n3) {
        super.a(bhl2, n2, n3);
    }

    @Override
    public void a(String string, int n2, int n3) {
        super.a(string, n2, n3);
    }

    @Override
    public void a(List list, int n2, int n3) {
        super.a(list, n2, n3);
    }

    @Override
    public void d() {
        this.a.g();
        super.d();
    }

    public int h() {
        return this.B.a;
    }

    public int a(String string) {
        return this.B.a(string);
    }

    public void b(String string, int n2, int n3, int n4) {
        this.B.a(string, (float)n2, (float)n3, n4);
    }

    public List a(String string, int n2) {
        return this.B.c(string, n2);
    }

    @Override
    public final void a(cwv cwv2) {
        this.a.a(((bxt)cwv2).e());
    }

    public void i() {
        this.y.clear();
    }

    public void a(f f2) {
        this.y.add(f2.getProxy());
    }

    public List j() {
        ArrayList arrayList = ov.c(this.y.size());
        for (cwv cwv2 : this.y) {
            arrayList.add(((bxt)cwv2).e());
        }
        return arrayList;
    }

    public void b(f f2) {
        this.y.remove(f2.getProxy());
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.a.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    public void p_() {
        this.a.a();
        super.p_();
    }

    @Override
    public void k() {
        this.a.w();
        super.k();
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.a.b(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, int n4, long l2) {
        this.a.a(n2, n3, n4, l2);
    }

    @Override
    public void a(char c2, int n2) {
        this.a.a(c2, n2);
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.a.a(bl2, n2);
    }

    @Override
    public void aG_() {
        this.a.h();
        super.aG_();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public class cwj {
    protected final Map a = sz.e();

    public boolean a(box box2) {
        return this.a((cyd)box2) > 0;
    }

    public boolean b(box box2) {
        return box2.c == null || this.a(box2.c);
    }

    public int c(box box2) {
        if (this.a(box2)) {
            return 0;
        }
        int n2 = 0;
        box box3 = box2.c;
        while (box3 != null && !this.a(box3)) {
            box3 = box3.c;
            ++n2;
        }
        return n2;
    }

    public void b(bdl bdl2, cyd cyd2, int n2) {
        if (cyd2.e() && !this.b((box)cyd2)) {
            return;
        }
        this.a(bdl2, cyd2, this.a(cyd2) + n2);
    }

    public void a(bdl bdl2, cyd cyd2, int n2) {
        bgj bgj2 = (bgj)this.a.get(cyd2);
        if (bgj2 == null) {
            bgj2 = new bgj();
            this.a.put(cyd2, bgj2);
        }
        bgj2.a(n2);
    }

    public int a(cyd cyd2) {
        bgj bgj2 = (bgj)this.a.get(cyd2);
        return bgj2 == null ? 0 : bgj2.a();
    }

    public awk b(cyd cyd2) {
        bgj bgj2 = (bgj)this.a.get(cyd2);
        if (bgj2 != null) {
            return bgj2.b();
        }
        return null;
    }

    public awk a(cyd cyd2, awk awk2) {
        bgj bgj2 = (bgj)this.a.get(cyd2);
        if (bgj2 == null) {
            bgj2 = new bgj();
            this.a.put(cyd2, bgj2);
        }
        bgj2.a(awk2);
        return awk2;
    }
}


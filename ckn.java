/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;

class ckn
implements bl {
    final /* synthetic */ String[] a;

    ckn(String[] arrstring) {
        this.a = arrstring;
    }

    public String a(bhl bhl2) {
        int n2 = bhl2.h();
        if (n2 < 0 || n2 >= this.a.length) {
            n2 = 0;
        }
        return this.a[n2];
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((bhl)object);
    }
}


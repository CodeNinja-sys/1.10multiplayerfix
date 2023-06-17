/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.l.m;
import java.util.Comparator;

class ahl
implements Comparator {
    final /* synthetic */ float[] a;
    final /* synthetic */ bix b;

    ahl(bix bix2, float[] arrf) {
        this.b = bix2;
        this.a = arrf;
    }

    public int a(Integer n2, Integer n3) {
        return m.a(this.a[n3], this.a[n2]);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}


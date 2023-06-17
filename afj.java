/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Random;

public enum afj implements cm,
Iterable
{
    a,
    b;


    public bqk[] a() {
        switch (this) {
            case a: {
                return new bqk[]{bqk.c, bqk.f, bqk.d, bqk.e};
            }
            case b: {
                return new bqk[]{bqk.b, bqk.a};
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    public bqk a(Random random) {
        bqk[] arrbqk = this.a();
        return arrbqk[random.nextInt(arrbqk.length)];
    }

    public boolean a(bqk bqk2) {
        return bqk2 != null && bqk2.l().e() == this;
    }

    public Iterator iterator() {
        return nj.b(this.a());
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((bqk)object);
    }
}


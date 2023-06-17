/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.util.e.l;

public class cll {
    public static final cll a = new cll(new l(), new l(), new l(1.0f, 1.0f, 1.0f));
    public final l b;
    public final l c;
    public final l d;

    public cll(l l2, l l3, l l4) {
        this.b = new l(l2);
        this.c = new l(l3);
        this.d = new l(l4);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            cll cll2 = (cll)object;
            return this.b.equals(cll2.b) && this.d.equals(cll2.d) && this.c.equals(cll2.c);
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        return n2;
    }
}


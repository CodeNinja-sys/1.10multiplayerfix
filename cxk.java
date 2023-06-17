/*
 * Decompiled with CFR 0.150.
 */
public class cxk {
    private final nc a;
    private final String b;

    public cxk(nc nc2, String string) {
        this.a = nc2;
        this.b = string;
    }

    public nc a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        cxk cxk2 = (cxk)object;
        if (this.a != cxk2.a) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(cxk2.b) : cxk2.b != null);
    }

    public String toString() {
        return "ClickEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }
}


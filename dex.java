/*
 * Decompiled with CFR 0.150.
 */
public class dex {
    private final km a;
    private final cbg b;

    public dex(km km2, cbg cbg2) {
        this.a = km2;
        this.b = cbg2;
    }

    public km a() {
        return this.a;
    }

    public cbg b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        dex dex2 = (dex)object;
        if (this.a != dex2.a) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(dex2.b) : dex2.b != null);
    }

    public String toString() {
        return "HoverEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }
}


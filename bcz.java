/*
 * Decompiled with CFR 0.150.
 */
public class bcz {
    private final int a;
    private final ccd b;

    public bcz(int n2, ccd ccd2) {
        this.a = n2;
        this.b = ccd2;
    }

    public int a() {
        return this.a;
    }

    public ccd b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bcz bcz2 = (bcz)object;
        return this.a == bcz2.a;
    }

    public int hashCode() {
        return this.a;
    }
}


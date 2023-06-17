/*
 * Decompiled with CFR 0.150.
 */
package b.a;

class i {
    final String a;
    final String b;

    i(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || !this.getClass().equals(object.getClass())) {
            return false;
        }
        i i2 = (i)object;
        return this.a.equals(i2.a) && this.b.equals(i2.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}


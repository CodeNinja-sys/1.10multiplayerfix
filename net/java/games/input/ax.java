/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class ax {
    private int a;
    private int b;

    ax() {
    }

    public final void a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int hashCode() {
        return this.a ^ this.b;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof ax)) {
            return false;
        }
        ax ax2 = (ax)object;
        return ax2.a == this.a && ax2.b == this.b;
    }

    public final String toString() {
        return "LinuxAxis: type = 0x" + Integer.toHexString(this.a) + ", code = 0x" + Integer.toHexString(this.b);
    }
}


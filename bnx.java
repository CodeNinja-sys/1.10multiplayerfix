/*
 * Decompiled with CFR 0.150.
 */
public class bnx {
    public float[] a;
    public final int b;

    public bnx(float[] arrf, int n2) {
        this.a = arrf;
        this.b = n2;
    }

    public float a(int n2) {
        if (this.a == null) {
            throw new NullPointerException("uvs");
        }
        int n3 = this.d(n2);
        return n3 == 0 || n3 == 1 ? this.a[0] : this.a[2];
    }

    public float b(int n2) {
        if (this.a == null) {
            throw new NullPointerException("uvs");
        }
        int n3 = this.d(n2);
        return n3 == 0 || n3 == 3 ? this.a[1] : this.a[3];
    }

    private int d(int n2) {
        return (n2 + this.b / 90) % 4;
    }

    public int c(int n2) {
        return (n2 + (4 - this.b / 90)) % 4;
    }

    public void a(float[] arrf) {
        if (this.a == null) {
            this.a = arrf;
        }
    }
}


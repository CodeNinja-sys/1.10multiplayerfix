/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bom {
    private final float a;
    private final float b;

    public bom(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public bom(float f2) {
        this.a = f2;
        this.b = f2;
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public int a(Random random) {
        return cmk.a(random, cmk.d(this.a), cmk.d(this.b));
    }

    public float b(Random random) {
        return cmk.a(random, this.a, this.b);
    }

    public boolean a(int n2) {
        return (float)n2 <= this.b && (float)n2 >= this.a;
    }

    static /* synthetic */ float a(bom bom2) {
        return bom2.a;
    }

    static /* synthetic */ float b(bom bom2) {
        return bom2.b;
    }
}


/*
 * Decompiled with CFR 0.150.
 */
public class csn
extends cjn {
    private final ut a;
    private int b;

    public csn(ut ut2) {
        this.a = ut2;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void cH_() {
        this.y.clear();
    }

    @Override
    public void d() {
        ++this.b;
        if (this.b % 20 == 0) {
            this.a.a(new ani());
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.c(0);
        this.a(this.B, bf.a("multiplayer.downloadingTerrain", new Object[0]), this.w / 2, this.x / 2 - 50, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    public boolean q_() {
        return false;
    }
}


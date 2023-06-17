/*
 * Decompiled with CFR 0.150.
 */
public class ayl
implements ye {
    private final bxy a = bxy.B();

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        String string;
        int n9 = n4 + n6 / 2 - this.a.k.a / 2;
        this.a.k.a(bf.a("lanServer.scanning", new Object[0]), this.a.m.w / 2 - this.a.k.a(bf.a("lanServer.scanning", new Object[0])) / 2, n9, 0xFFFFFF);
        switch ((int)(bxy.K() / 300L % 4L)) {
            default: {
                string = "O o o";
                break;
            }
            case 1: 
            case 3: {
                string = "o O o";
                break;
            }
            case 2: {
                string = "o o O";
            }
        }
        this.a.k.a(string, this.a.m.w / 2 - this.a.k.a(string) / 2, n9 + this.a.k.a, 0x808080);
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }
}


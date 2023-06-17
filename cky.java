/*
 * Decompiled with CFR 0.150.
 */
import java.net.URI;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cky
extends cjn {
    private static final d a = c.c();
    private static final bpx b = new bpx("textures/gui/demo_background.png");

    @Override
    public void cH_() {
        this.y.clear();
        int n2 = -16;
        this.y.add(new cwv(1, this.w / 2 - 116, this.x / 2 + 62 + -16, 114, 20, bf.a("demo.help.buy", new Object[0])));
        this.y.add(new cwv(2, this.w / 2 + 2, this.x / 2 + 62 + -16, 114, 20, bf.a("demo.help.later", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        switch (cwv2.j) {
            case 2: {
                this.u.a((cjn)null);
                this.u.q();
                break;
            }
            case 1: {
                cwv2.k = false;
                try {
                    Class<?> class_ = Class.forName("java.awt.Desktop");
                    Object object = class_.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class_.getMethod("browse", URI.class).invoke(object, new URI("http://www.minecraft.net/store?source=demo"));
                    break;
                }
                catch (Throwable throwable) {
                    a.b("Couldn't open link", throwable);
                }
            }
        }
    }

    @Override
    public void d() {
        super.d();
    }

    @Override
    public void aH_() {
        super.aH_();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(b);
        int n2 = (this.w - 248) / 2;
        int n3 = (this.x - 166) / 2;
        this.c(n2, n3, 0, 0, 248, 166);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        int n4 = (this.w - 248) / 2 + 10;
        int n5 = (this.x - 166) / 2 + 8;
        this.B.a(bf.a("demo.help.title", new Object[0]), n4, n5, 0x1F1F1F);
        cmx cmx2 = this.u.u;
        this.B.a(bf.a("demo.help.movementShort", cmx.a(cmx2.S.j()), cmx.a(cmx2.T.j()), cmx.a(cmx2.U.j()), cmx.a(cmx2.V.j())), n4, n5 += 12, 0x4F4F4F);
        this.B.a(bf.a("demo.help.movementMouse", new Object[0]), n4, n5 + 12, 0x4F4F4F);
        this.B.a(bf.a("demo.help.jump", cmx.a(cmx2.W.j())), n4, n5 + 24, 0x4F4F4F);
        this.B.a(bf.a("demo.help.inventory", cmx.a(cmx2.Z.j())), n4, n5 + 36, 0x4F4F4F);
        this.B.a(bf.a("demo.help.fullWrapped", new Object[0]), n4, n5 + 68, 218, 0x1F1F1F);
        super.a(n2, n3, f2);
    }
}


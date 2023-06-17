/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class blq
extends cck
implements csc {
    private final a a;

    public blq(a a2) {
        this.a = a2;
        this.a(new pr());
        this.a(new bip());
        this.a(new aeq());
        this.a(new cif());
        this.a(new cob());
        this.a(new bb());
        this.a(new cdw());
        this.a(new bir());
        this.a(new bim());
        this.a(new bbl());
        this.a(new awj());
        this.a(new ma());
        this.a(new akn());
        this.a(new ccm());
        this.a(new pe());
        this.a(new bpe());
        this.a(new ahn());
        this.a(new clg());
        this.a(new zl());
        this.a(new akm());
        this.a(new awh());
        this.a(new buo());
        this.a(new o());
        this.a(new aop());
        this.a(new wn());
        this.a(new brp());
        this.a(new mm());
        this.a(new aea());
        this.a(new bvc());
        this.a(new dm());
        this.a(new chr());
        this.a(new biw());
        this.a(new btw());
        this.a(new cci());
        this.a(new ht());
        this.a(new cal());
        this.a(new bhn());
        this.a(new aom());
        this.a(new ez());
        this.a(new bsb());
        this.a(new op());
        this.a(new bob());
        this.a(new uj());
        this.a(new axi());
        this.a(new dbw());
        if (a2.aa()) {
            this.a(new csx());
            this.a(new dn());
            this.a(new bpo());
            this.a(new cyp());
            this.a(new ddj());
            this.a(new bdn());
            this.a(new ata());
            this.a(new akg());
            this.a(new afc());
            this.a(new ban());
            this.a(new cow());
            this.a(new bpt());
            this.a(new amg());
            this.a(new aod());
            this.a(new auq());
        } else {
            this.a(new tl());
        }
        mn.a(this);
    }

    @Override
    public void a(ala ala2, fh fh2, int n2, String string, Object ... arrobject) {
        boolean bl2 = true;
        a a2 = this.a;
        if (!ala2.C_()) {
            bl2 = false;
        }
        du du2 = new du("chat.type.admin", ala2.i_(), new du(string, arrobject));
        du2.h().a(aug.h);
        du2.h().b(true);
        if (bl2) {
            for (bdl bdl2 : ((cmt)((Object)a2.al())).u()) {
                boolean bl3;
                if (bdl2 == ala2 || !((cmt)((Object)a2.al())).e(bdl2.aq()) || !fh2.a(this.a, ala2)) continue;
                boolean bl4 = ala2 instanceof a && this.a.s();
                boolean bl5 = bl3 = ala2 instanceof ccu && this.a.r();
                if (!bl4 && !bl3 && (ala2 instanceof ccu || ala2 instanceof a)) continue;
                bdl2.a(du2);
            }
        }
        if (ala2 != a2 && ((iu)((Object)a2.d[0])).F().b("logAdminCommands")) {
            a2.a((ey)((Object)du2));
        }
        boolean bl6 = ((iu)((Object)a2.d[0])).F().b("sendCommandFeedback");
        if (ala2 instanceof cxh) {
            bl6 = ((cxh)ala2).m();
        }
        if ((n2 & 1) != 1 && bl6 || ala2 instanceof a) {
            ala2.a(new du(string, arrobject));
        }
    }

    @Override
    protected a a() {
        return this.a;
    }
}


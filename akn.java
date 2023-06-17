/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.c.a;

public class akn
extends mn {
    @Override
    public String a() {
        return "stats";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.stats.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        bsv bsv2;
        Object object;
        Object object2;
        bnw bnw2;
        int n2;
        boolean bl2;
        if (arrstring.length < 1) {
            throw new ben("commands.stats.usage", new Object[0]);
        }
        if ("entity".equals(arrstring[0])) {
            bl2 = false;
        } else {
            if (!"block".equals(arrstring[0])) throw new ben("commands.stats.usage", new Object[0]);
            bl2 = true;
        }
        if (bl2) {
            if (arrstring.length < 5) {
                throw new ben("commands.stats.block.usage", new Object[0]);
            }
            n2 = 4;
        } else {
            if (arrstring.length < 3) {
                throw new ben("commands.stats.entity.usage", new Object[0]);
            }
            n2 = 2;
        }
        String string = arrstring[n2++];
        if ("set".equals(string)) {
            if (arrstring.length < n2 + 3) {
                if (n2 != 5) throw new ben("commands.stats.entity.set.usage", new Object[0]);
                throw new ben("commands.stats.block.set.usage", new Object[0]);
            }
        } else {
            if (!"clear".equals(string)) throw new ben("commands.stats.usage", new Object[0]);
            if (arrstring.length < n2 + 1) {
                if (n2 != 5) throw new ben("commands.stats.entity.clear.usage", new Object[0]);
                throw new ben("commands.stats.block.clear.usage", new Object[0]);
            }
        }
        if ((bnw2 = bnw.a(arrstring[n2++])) == null) {
            throw new kx("commands.stats.failed", new Object[0]);
        }
        iu iu2 = ala2.m_();
        if (bl2) {
            object2 = akn.a(ala2, arrstring, 1, false);
            object = iu2.q((cmz)object2);
            if (object == null) {
                throw new kx("commands.stats.noCompatibleBlock", ((cjx)object2).a(), ((cjx)object2).b(), ((cjx)object2).c());
            }
            if (object instanceof jf) {
                bsv2 = ((jf)object).f();
            } else {
                if (!(object instanceof bxr)) throw new kx("commands.stats.noCompatibleBlock", ((cjx)object2).a(), ((cjx)object2).b(), ((cjx)object2).c());
                bsv2 = ((bxr)object).h();
            }
        } else {
            object2 = akn.b(a2, ala2, arrstring[1]);
            bsv2 = ((cpk)object2).cF();
        }
        if ("set".equals(string)) {
            object2 = arrstring[n2++];
            object = arrstring[n2];
            if (((String)object2).isEmpty() || ((String)object).isEmpty()) {
                throw new kx("commands.stats.failed", new Object[0]);
            }
            bsv.a(bsv2, bnw2, (String)object2, (String)object);
            akn.a(ala2, (fh)this, "commands.stats.success", bnw2.b(), object, object2);
        } else if ("clear".equals(string)) {
            bsv.a(bsv2, bnw2, null, null);
            akn.a(ala2, (fh)this, "commands.stats.cleared", bnw2.b());
        }
        if (!bl2) return;
        object2 = akn.a(ala2, arrstring, 1, false);
        object = iu2.q((cmz)object2);
        ((bql)object).c_();
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return akn.a(arrstring, "entity", "block");
        }
        if (arrstring.length == 2 && "entity".equals(arrstring[0])) {
            return akn.a(arrstring, a2.J());
        }
        if (arrstring.length >= 2 && arrstring.length <= 4 && "block".equals(arrstring[0])) {
            return akn.a(arrstring, 1, cmz2);
        }
        if (arrstring.length == 3 && "entity".equals(arrstring[0]) || arrstring.length == 5 && "block".equals(arrstring[0])) {
            return akn.a(arrstring, "set", "clear");
        }
        if (arrstring.length == 4 && "entity".equals(arrstring[0]) || arrstring.length == 6 && "block".equals(arrstring[0])) {
            return akn.a(arrstring, bnw.c());
        }
        if (arrstring.length == 6 && "entity".equals(arrstring[0]) || arrstring.length == 8 && "block".equals(arrstring[0])) {
            return akn.a(arrstring, this.a(a2));
        }
        return Collections.emptyList();
    }

    protected List a(a a2) {
        Collection collection = ((iu)((Object)a2.a(0))).P().b();
        ArrayList arrayList = ov.a();
        for (bhi bhi2 : collection) {
            if (bhi2.c().b()) continue;
            arrayList.add(bhi2.b());
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return arrstring.length > 0 && "entity".equals(arrstring[0]) && n2 == 1;
    }
}


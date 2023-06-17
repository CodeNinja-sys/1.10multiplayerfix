/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.c.a;

public class zl
extends mn {
    private static final String[] a = new String[]{"Yolo", "/achievement take achievement.understandCommands @p", "Ask for help on twitter", "/deop @p", "Scoreboard deleted, commands blocked", "Contact helpdesk for help", "/testfornoob @p", "/trigger warning", "Oh my god, it's full of stats", "/kill @p[name=!Searge]", "Have you tried turning it off and on again?", "Sorry, no help today"};
    private final Random b = new Random();

    @Override
    public String a() {
        return "help";
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public String a(ala ala2) {
        return "commands.help.usage";
    }

    @Override
    public List c() {
        return Arrays.asList("?");
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (ala2 instanceof cxh) {
            ala2.a(new aym("Searge says: ").b(a[this.b.nextInt(a.length) % a.length]));
            return;
        }
        List list = this.a(ala2, a2);
        int n2 = 7;
        int n3 = (list.size() - 1) / 7;
        int n4 = 0;
        try {
            n4 = arrstring.length == 0 ? 0 : zl.a(arrstring[0], 1, n3 + 1) - 1;
        }
        catch (cml cml2) {
            Map map = this.a(a2);
            fh fh2 = (fh)map.get(arrstring[0]);
            if (fh2 != null) {
                throw new ben(fh2.a(ala2), new Object[0]);
            }
            if (cmk.a(arrstring[0], -1) != -1) {
                throw cml2;
            }
            throw new vz();
        }
        int n5 = Math.min((n4 + 1) * 7, list.size());
        du du2 = new du("commands.help.header", n4 + 1, n3 + 1);
        du2.h().a(aug.c);
        ala2.a(du2);
        for (int i2 = n4 * 7; i2 < n5; ++i2) {
            fh fh3 = (fh)list.get(i2);
            du du3 = new du(fh3.a(ala2), new Object[0]);
            du3.h().a(new cxk(nc.d, "/" + fh3.a() + " "));
            ala2.a(du3);
        }
        if (n4 == 0 && ala2 instanceof bdl) {
            du du4 = new du("commands.help.footer", new Object[0]);
            du4.h().a(aug.k);
            ala2.a(du4);
        }
    }

    protected List a(ala ala2, a a2) {
        List list = a2.N().a(ala2);
        Collections.sort(list);
        return list;
    }

    protected Map a(a a2) {
        return a2.N().b();
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            Set set = this.a(a2).keySet();
            return zl.a(arrstring, set.toArray(new String[set.size()]));
        }
        return Collections.emptyList();
    }
}


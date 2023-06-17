/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class cck
implements cxz {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Map b = sz.c();
    private final Set c = aad.a();

    @Override
    public int a(ala ala2, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] arrstring = string.split(" ");
        String string2 = arrstring[0];
        arrstring = cck.a(arrstring);
        fh fh2 = (fh)this.b.get(string2);
        int n2 = this.a(fh2, arrstring);
        int n3 = 0;
        if (fh2 == null) {
            du du2 = new du("commands.generic.notFound", new Object[0]);
            du2.h().a(aug.m);
            ala2.a(du2);
        } else if (fh2.a(this.a(), ala2)) {
            if (n2 > -1) {
                List list = an.b(ala2, arrstring[n2], cpk.class);
                String string3 = arrstring[n2];
                ala2.a(bnw.c, list.size());
                for (cpk cpk2 : list) {
                    arrstring[n2] = cpk2.cy();
                    if (!this.a(ala2, arrstring, fh2, string)) continue;
                    ++n3;
                }
                arrstring[n2] = string3;
            } else {
                ala2.a(bnw.c, 1);
                if (this.a(ala2, arrstring, fh2, string)) {
                    ++n3;
                }
            }
        } else {
            du du3 = new du("commands.generic.permission", new Object[0]);
            du3.h().a(aug.m);
            ala2.a(du3);
        }
        ala2.a(bnw.a, n3);
        return n3;
    }

    protected boolean a(ala ala2, String[] arrstring, fh fh2, String string) {
        try {
            fh2.a(this.a(), ala2, arrstring);
            return true;
        }
        catch (ben ben2) {
            du du2 = new du("commands.generic.usage", new du(ben2.getMessage(), ben2.a()));
            du2.h().a(aug.m);
            ala2.a(du2);
        }
        catch (kx kx2) {
            du du3 = new du(kx2.getMessage(), kx2.a());
            du3.h().a(aug.m);
            ala2.a(du3);
        }
        catch (Throwable throwable) {
            du du4 = new du("commands.generic.exception", new Object[0]);
            du4.h().a(aug.m);
            ala2.a(du4);
            a.f("Couldn't process command: '{}'", string);
        }
        return false;
    }

    protected abstract a a();

    public fh a(fh fh2) {
        this.b.put(fh2.a(), fh2);
        this.c.add(fh2);
        for (String string : fh2.c()) {
            fh fh3 = (fh)this.b.get(string);
            if (fh3 != null && fh3.a().equals(string)) continue;
            this.b.put(string, fh2);
        }
        return fh2;
    }

    private static String[] a(String[] arrstring) {
        String[] arrstring2 = new String[arrstring.length - 1];
        System.arraycopy(arrstring, 1, arrstring2, 0, arrstring.length - 1);
        return arrstring2;
    }

    @Override
    public List a(ala ala2, String string, cmz cmz2) {
        fh fh2;
        String[] arrstring = string.split(" ", -1);
        String string2 = arrstring[0];
        if (arrstring.length == 1) {
            ArrayList arrayList = ov.a();
            for (Map.Entry entry : this.b.entrySet()) {
                if (!mn.a(string2, (String)entry.getKey()) || !((fh)entry.getValue()).a(this.a(), ala2)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (arrstring.length > 1 && (fh2 = (fh)this.b.get(string2)) != null && fh2.a(this.a(), ala2)) {
            return fh2.a(this.a(), ala2, cck.a(arrstring), cmz2);
        }
        return Collections.emptyList();
    }

    @Override
    public List a(ala ala2) {
        ArrayList arrayList = ov.a();
        for (fh fh2 : this.c) {
            if (!fh2.a(this.a(), ala2)) continue;
            arrayList.add(fh2);
        }
        return arrayList;
    }

    @Override
    public Map b() {
        return this.b;
    }

    private int a(fh fh2, String[] arrstring) {
        if (fh2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!fh2.a(arrstring, i2) || !an.a(arrstring[i2])) continue;
            return i2;
        }
        return -1;
    }
}


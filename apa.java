/*
 * Decompiled with CFR 0.150.
 */
public class apa {
    public static cbg a(ala ala2, cbg cbg2, cpk cpk2) {
        Object object3;
        Object object2;
        cbg cbg3 = null;
        if (cbg2 instanceof jv) {
            object2 = (jv)cbg2;
            String string = ((jv)object2).a();
            if (an.b(string)) {
                object3 = an.b(ala2, string, cpk.class);
                if (object3.size() != 1) {
                    throw new bbg();
                }
                cpk cpk3 = (cpk)object3.get(0);
                string = cpk3 instanceof bdl ? cpk3.i_() : cpk3.cy();
            }
            cbg3 = cpk2 != null && string.equals("*") ? new jv(cpk2.i_(), ((jv)object2).c()) : new jv(string, ((jv)object2).c());
            ((jv)cbg3).a(ala2);
        } else if (cbg2 instanceof avy) {
            object2 = ((avy)cbg2).a();
            cbg3 = an.b(ala2, (String)object2);
            if (cbg3 == null) {
                cbg3 = new aym("");
            }
        } else if (cbg2 instanceof aym) {
            cbg3 = new aym(((aym)cbg2).a());
        } else if (cbg2 instanceof du) {
            object2 = ((du)cbg2).e();
            for (int i2 = 0; i2 < ((Object[])object2).length; ++i2) {
                object3 = object2[i2];
                if (!(object3 instanceof cbg)) continue;
                object2[i2] = apa.a(ala2, (cbg)object3, cpk2);
            }
            cbg3 = new du(((du)cbg2).d(), (Object[])object2);
        } else {
            return cbg2;
        }
        object2 = cbg2.h();
        if (object2 != null) {
            cbg3.a(((bcc)object2).l());
        }
        for (Object object3 : cbg2.g()) {
            cbg3.a(apa.a(ala2, (cbg)object3, cpk2));
        }
        return cbg3;
    }
}


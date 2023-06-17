/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ex;
import com.ibm.icu.a.fu;
import com.ibm.icu.util.dv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;

class fv
extends ex {
    private fv() {
    }

    protected Map a(String string, String string2) {
        Map<String, String> map = null;
        dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "metaZones");
        dv dv3 = dv2.l("mapTimezones");
        try {
            dv dv4 = dv3.l(string);
            Set set = dv4.keySet();
            map = new HashMap(set.size());
            for (String string3 : set) {
                String string4 = dv4.getString(string3).intern();
                map.put(string3.intern(), string4);
            }
        }
        catch (MissingResourceException missingResourceException) {
            map = Collections.emptyMap();
        }
        return map;
    }

    protected /* synthetic */ Object b(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }

    /* synthetic */ fv(fu fu2) {
        this();
    }
}


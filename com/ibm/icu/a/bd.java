/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ak;
import com.ibm.icu.a.bc;
import com.ibm.icu.a.be;
import com.ibm.icu.a.it;
import com.ibm.icu.util.dn;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

final class bd
implements PrivilegedAction {
    final /* synthetic */ String a;
    final /* synthetic */ ClassLoader b;

    bd(String string, ClassLoader classLoader) {
        this.a = string;
        this.b = classLoader;
    }

    public List a() {
        Object object;
        Object object2;
        Object object3;
        String string = this.a.endsWith("/") ? this.a : this.a + "/";
        ArrayList<Object> arrayList = null;
        String string2 = ak.a("com.ibm.icu.impl.ICUResourceBundle.skipRuntimeLocaleResourceScan", "false");
        if (!string2.equalsIgnoreCase("true")) {
            try {
                object3 = this.b.getResources(string);
                while (object3.hasMoreElements()) {
                    object2 = object3.nextElement();
                    object = it.a((URL)object2);
                    if (object != null) {
                        ArrayList arrayList2 = new ArrayList();
                        be be2 = new be(this, arrayList2);
                        ((it)object).a(be2, false);
                        if (arrayList == null) {
                            arrayList = new ArrayList(arrayList2);
                            continue;
                        }
                        arrayList.addAll(arrayList2);
                        continue;
                    }
                    if (!bc.s()) continue;
                    System.out.println("handler for " + object2 + " is null");
                }
            }
            catch (IOException iOException) {
                if (bc.s()) {
                    System.out.println("ouch: " + iOException.getMessage());
                }
                arrayList = null;
            }
        }
        if (arrayList == null) {
            try {
                object3 = this.b.getResourceAsStream(string + "fullLocaleNames.lst");
                if (object3 != null) {
                    arrayList = new ArrayList<Object>();
                    object2 = new BufferedReader(new InputStreamReader((InputStream)object3, "ASCII"));
                    while ((object = ((BufferedReader)object2).readLine()) != null) {
                        if (((String)object).length() == 0 || ((String)object).startsWith("#")) continue;
                        if (((String)object).equalsIgnoreCase("root")) {
                            arrayList.add(dn.v.toString());
                            continue;
                        }
                        arrayList.add(object);
                    }
                    ((BufferedReader)object2).close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return arrayList;
    }

    public /* synthetic */ Object run() {
        return this.a();
    }
}


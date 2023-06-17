/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.am;
import com.ibm.icu.a.b.a.a;
import com.ibm.icu.a.b.a.q;
import com.ibm.icu.a.b.a.r;
import com.ibm.icu.a.b.a.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;

public class u
extends r {
    private Collection a;
    private q b = null;
    private String c = null;
    private Map d = new HashMap();
    private static final String e = "data/";
    private static final u f = new u();

    public static u b() {
        return f;
    }

    private u() {
        ArrayList<String> arrayList = new ArrayList<String>();
        InputStream inputStream = am.b(this.getClass(), "data/index.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String string = null;
            while (null != (string = bufferedReader.readLine())) {
                if ((string = string.trim()).startsWith("#") || string.length() == 0) continue;
                arrayList.add(string);
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("IO Error reading data/index.txt: " + iOException.toString());
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public q a(String string) {
        int n2 = string.indexOf(64);
        if (n2 != -1) {
            string = string.substring(0, n2);
        }
        u u2 = this;
        synchronized (u2) {
            if (this.c != null && this.c.equals(string)) {
                return this.b;
            }
            q q2 = (q)this.d.get(string);
            if (q2 == null) {
                String string2 = string;
                while (!this.a.contains(string2)) {
                    int n3 = string2.lastIndexOf("_");
                    if (n3 > -1) {
                        string2 = string2.substring(0, n3);
                        continue;
                    }
                    if (!"test".equals(string2)) {
                        string2 = "test";
                        continue;
                    }
                    string2 = null;
                    break;
                }
                if (string2 == null) throw new MissingResourceException("Duration data not found for  " + string, e, string);
                String string3 = "data/pfd_" + string2 + ".xml";
                try {
                    InputStream inputStream = am.a(this.getClass(), string3);
                    if (inputStream == null) {
                        throw new MissingResourceException("no resource named " + string3, string3, "");
                    }
                    a a2 = com.ibm.icu.a.b.a.a.a(string2, new x(new InputStreamReader(inputStream, "UTF-8")));
                    if (a2 != null) {
                        q2 = new q(string, a2);
                    }
                }
                catch (UnsupportedEncodingException unsupportedEncodingException) {
                    throw new MissingResourceException("Unhandled Encoding for resource " + string3, string3, "");
                }
                this.d.put(string, q2);
            }
            this.b = q2;
            this.c = string;
            return q2;
        }
    }

    public Collection a() {
        return this.a;
    }
}


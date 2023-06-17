/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import java.net.IDN;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class o {
    private final String a;
    private final int b;

    private o(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public String a() {
        try {
            return IDN.toASCII(this.a);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return "";
        }
    }

    public int b() {
        return this.b;
    }

    public static o a(String string) {
        int n2;
        Object object;
        int n3;
        if (string == null) {
            return null;
        }
        String[] arrstring = string.split(":");
        if (string.startsWith("[") && (n3 = string.indexOf("]")) > 0) {
            String string2 = string.substring(1, n3);
            object = string.substring(n3 + 1).trim();
            if (object.startsWith(":") && !object.isEmpty()) {
                object = object.substring(1);
                arrstring = new String[]{string2, object};
            } else {
                arrstring = new String[]{string2};
            }
        }
        if (arrstring.length > 2) {
            arrstring = new String[]{string};
        }
        String string3 = arrstring[0];
        int n4 = n2 = arrstring.length > 1 ? o.a(arrstring[1], 25565) : 25565;
        if (n2 == 25565) {
            object = o.b(string3);
            string3 = object[0];
            n2 = o.a(object[1], 25565);
        }
        return new o(string3, n2);
    }

    private static String[] b(String string) {
        try {
            String string2 = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = initialDirContext.getAttributes("_minecraft._tcp." + string, new String[]{"SRV"});
            String[] arrstring = attributes.get("srv").get().toString().split(" ", 4);
            return new String[]{arrstring[3], arrstring[2]};
        }
        catch (Throwable throwable) {
            return new String[]{string, Integer.toString(25565)};
        }
    }

    private static int a(String string, int n2) {
        try {
            return Integer.parseInt(string.trim());
        }
        catch (Exception exception) {
            return n2;
        }
    }
}


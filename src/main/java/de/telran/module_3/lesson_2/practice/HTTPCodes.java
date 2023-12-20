package de.telran.module_3.lesson_2.practice;

import lombok.Getter;

@Getter
public enum HTTPCodes {
    INFORMATIONAL(100,199,
            ((code, codes) -> System.out.println
                    (code + " принадлежит INFORMATIONAL группе в перечислении HttpCodes."+codes))), //100-199
    SUCCESS(200,299,
            ((code, codes) -> System.out.println
                    (code + " принадлежит SUCCESS группе в перечислении HttpCodes."+codes))), //200-299
    REDIRECTION(300,399,
            ((code, codes) -> System.out.println
                    (code + " принадлежит REDIRECTION группе в перечислении HttpCodes."+codes))), //300-399
    CLIENT_ERROR(400,499,
            ((code, codes) -> System.out.println
                    (code + " принадлежит CLIENT_ERROR группе в перечислении HttpCodes."+codes))), //400-499
    SERVER_ERROR(500,599,
            ((code, codes) -> System.out.println
                    (code + " принадлежит SERVER_ERROR группе в перечислении HttpCodes."+codes))); //500-599

    int minCode;
    int maxCode;
    Action valueAction;

    HTTPCodes(int minCode, int maxCode) {
        this.minCode = minCode;
        this.maxCode = maxCode;
    }

    HTTPCodes(int minCode, int maxCode, Action action) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.valueAction = action;
    }

    public static void findValueByCode( int code){
        for (HTTPCodes v:HTTPCodes.values()) {
            if(code >=v.minCode && code <= v.maxCode)
                v.doRunAction(code, v);
            break;

        }
    }

    public void doRunAction(int code, HTTPCodes v){
        if (valueAction != null)
            valueAction.action(code, v);
    }
}

package modelos;

public class Banco {
    private String ispb;
    private String name;
    private int code;
    private String fullName;


    public String getIspb() {
        return ispb;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }


    @Override
    public String toString() {
        return """
                ===== BANCO =====
                Código: %d
                Nome: %s
                Nome completo: %s
                ISPB: %s
                =================
                """.formatted(
                code,
                name,
                fullName,
                ispb
        );
    }
}

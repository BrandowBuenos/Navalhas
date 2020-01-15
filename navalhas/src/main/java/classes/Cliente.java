package classes;

/**
 * Cliente
 */
public class Cliente {
    private String nome;
    private String contato1;
    private String contato2;
    private String foto;
    private byte biometria;
    private int servicosGratis = 0;
    private boolean servicoGratis;
    private int servicosTotal = 0;
    private int servicos = 0;

    public Cliente (String nome){
        this.nome = nome;
    }

    public void novoServiço(){
        servicosTotal += 1;
        servicos += 1;
        servicoGratis = false;
        if (servicos > 9) {
            servicoGratis = true;
            servicos = 0;
            servicosGratis += 1;
        }
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * @return the nome
     */
    public Boolean getServicoGratis() {
        return servicoGratis;
    }

    /**
     * @return the contato1
     */
    public String getContato1() {
        return contato1;
    }

    /**
     * @return the contato2
     */
    public String getContato2() {
        return contato2;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @return the biometria
     */
    public byte getBiometria() {
        return biometria;
    }

    /**
     * @return the servicos
     */
    public int getServicos() {
        return servicos;
    }

    /**
     * @return the servicosGratis
     */
    public int getServicosGratis() {
        return servicosGratis;
    }
    /**
     * @return the servicosTotal
     */
    public int getServicosTotal() {
        return servicosTotal;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param i the contato1 to set
     */
    public void setContato1(String i) {
        this.contato1 = i;
    }

    /**
     * @param contato2 the contato2 to set
     */
    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @param biometria the biometria to set
     */
    public void setBiometria(byte biometria) {
        this.biometria = biometria;
    }
     
}
package Exe10;

import java.util.ArrayList;
import java.util.List;

class Aviao {
    private String prefixo;
    private String modelo;
    private String fabricante;
    private int assentos;
    private int assentosOcupados;

    public Aviao(String prefixo, String modelo, String fabricante, int assentos) {
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.assentos = assentos;
        this.assentosOcupados = 0;
    }

    public String getPrefixo() {
        return prefixo;
    }
    public void ocuparAssento() {
        if (assentosOcupados < assentos) {
            assentosOcupados++;
        } else {
            System.out.println("Não há mais assentos disponíveis.");
        }
    }

    public void desocuparAssento() {
        if (assentosOcupados > 0) {
            assentosOcupados--;
        }
    }

    public boolean estaPousadoNoAeroporto(Aeroporto aeroporto) {
        return aeroporto.temAviaoPousado(this);
    }

    public String getModelo() {
        return null;
    }

    public String getAssentos() {
        return null;
    }

    public String getFabricante() {
        return null;
    }
}

class Aeroporto {
    private String codigo;
    private String nome;
    private boolean internacional;
    private List<Aeroporto> voosDiretos;
    private List<Aeroporto> voosDeOrigem;
    private List<Aviao> avioesNoPatio;

    public Aeroporto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.internacional = false;
        this.voosDiretos = new ArrayList<>();
        this.voosDeOrigem = new ArrayList<>();
        this.avioesNoPatio = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void tornarInternacional() {
        internacional = true;
    }

    public void tornarNacional() {
        internacional = false;
    }

    public boolean equals(Aeroporto outroAeroporto) {
        return this.codigo.equals(outroAeroporto.getCodigo());
    }

    public boolean temAviaoPousado(Aviao aviao) {
        return avioesNoPatio.contains(aviao);
    }

    public void adicionarAviaoNoPatio(Aviao aviao) {
        if (avioesNoPatio.size() < 100) {
            avioesNoPatio.add(aviao);
        } else {
            System.out.println("O pátio do aeroporto está lotado.");
        }
    }

    public boolean possuiRota(Aeroporto destino) {
        if (voosDiretos.contains(destino)) {
            return true;
        } else {
            for (Aeroporto aeroporto : voosDeOrigem) {
                if (aeroporto.possuiRota(destino)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void adicionarVooDireto(Aeroporto destino) {
        if (!voosDiretos.contains(destino)) {
            voosDiretos.add(destino);
        }
    }

    public void adicionarVooDeOrigem(Aeroporto origem) {
        if (!voosDeOrigem.contains(origem)) {
            voosDeOrigem.add(origem);
        }
    }
}


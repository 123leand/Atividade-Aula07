public class App {
    public static void main(String[] args) throws Exception {


        PessoaFisica pedro = new PessoaFisica("Pedro", "João", "Masculino", "Divorciado", "88106679", "01020304051", 40);
        
        try {

            pedro.setCep("88106679"); 
        }
        
        catch (Exception e) {

            System.out.println(e.getMessage());
        }

                System.out.println("Execução terminada");
    }  
}



class PessoaFisica {
    private String nome, sobreNome, genero, estadoCivil, cep ,cpf;
    private int idade;
  
    public PessoaFisica(String nome, String sobreNome, String genero, String estadoCivil, String cep, String cpf,
            int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.cpf = cpf;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSobreNome() {
        return sobreNome;
    }

    public void setUltimoNome(String sobrenome) {
        this.sobreNome = sobrenome;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getEstadoCivil() {
        return estadoCivil;
    }


    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws IllegalArgumentException{
        this.cep = cep;
            if(cep.length() != 8){
                IllegalArgumentException erro = new IllegalArgumentException("CEP Inválido");
                throw erro;
            }        
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    @Override
    public int hashCode() {
        final int prime = 40;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sobreNome == null) ? 0 : sobreNome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + idade;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        PessoaFisica other = (PessoaFisica) obj;
                if (nome == null) {
            if (other.nome != null)
                return false;

        } else if (!nome.equals(other.nome))
            return false;

        if (sobreNome == null) {
            if (other.sobreNome != null)
                return false;

        } else if (!sobreNome.equals(other.sobreNome))
            return false;

        if (genero == null) {
            if (other.genero != null)
                return false;

        } else if (!genero.equals(other.genero))
            return false;

        if (estadoCivil == null) {
            if (other.estadoCivil != null)
                return false;

        } else if (!estadoCivil.equals(other.estadoCivil))
            return false;

        if (cep == null) {
            if (other.cep != null)
                return false;

        } else if (!cep.equals(other.cep))
            return false;

        if (cpf == null) {
            if (other.cpf != null)
                return false;

        } else if (!cpf.equals(other.cpf))
            return false;

        if (idade != other.idade)
            return false;
            
        return true;
    }



    @Override
    public String toString() {
        return "PessoaFisica [nome=" + nome + ", sobreNome=" + sobreNome + ", genero=" + genero + ", estadoCivil="
                + estadoCivil + ", cep=" + cep + ", cpf=" + cpf + ", idade=" + idade + "]";
    }
    
}


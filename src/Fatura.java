public class Fatura { // "FATURA" PODERIA SER CONSIDERADA UMA SUBCLASSE DE "BANCO", E BANCO
                      //  SERIA UMA SUPERCLASSE, NESSE SENTIDO FATURA  HERDARIA AS AÇÕES DE
                      //  BANCO (HERANÇA). 
                      //  FATURA   PODERIA  SER   FRAGMENTADA   EM    OUTRAS    CATEGORIAS:  
                      //  FaturaEmprestimo, FaturaHipoteca, FaturasAtrasadas
                      //  TODAS AS FATURAS SÃO FATURAS POREM CADA  UMA SERVE A UM PROPOSITO
                      //  DEMONSTRANDO ASSIM O (POLIMORFISMO).
// atributos
private double quant = 0;
private double preco = 0;

// costrutor
public Fatura(double quant, double preco) {

    if(quant >= 0)   {
    this.quant = quant;
                    }
    else{this.quant= 0.0;} 


    if(preco >= 0)   {
    this.preco = preco;
                        }
    else{this.preco= 0.0;}
   
}
// funções especificas
public double Calcular(){
    return preco * quant;
}
// getters and setters

        public double getQuant() {
            return quant;
        }
        public void setQuant(double quant) {
                if(quant >= 0)   {
                this.quant = quant;
                                }
                else{this.quant= 0.0;}
        }
        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            
                if(preco >= 0)   {
                this.preco = preco;
                            }
                else{this.preco= 0.0;}
        }























}
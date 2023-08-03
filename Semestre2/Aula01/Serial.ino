void setup()
{
    // Criação do seial para saida de vídeo
    Serial.begin(9600);

    // definição da saida do swit
    pinMode(A1, INPUT);
}

void loop()
{
    // Programa para saida de vídeo
    Serial.println("Hello World");

    // Definindo porta do serial
    Serial.println(digitalRead(A1));
}

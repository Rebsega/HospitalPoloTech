# HospitalPoloTech

Projeto final - Sistema de hospital - Módulo II prof. Igor Mascarenhas, PoloTech

O projeto foi baseado em uma escala de hierarquias, tendo primariamente, pessoa e sala.<br>
Isto foi pensado pois todo medico, atendente, ou paciente, será uma pessoa, logo a classe pessoa será a abstrata para estas outras, subsequentes.<br>
Da mesma forma, todo medico, ou atendente, serão funcionários, logo a classe Funcionário será abstraída para estas duas.<br>
O raciocínio para Sala, foi feito de tal forma: <br>
Todo Atendimento será feito em uma sala, logo a Sala será a classe pai, para a classe filho, Atendimento. <br>
Na classe main, foram criados por padrão alguns perfis de usuários (médicos, pacientes, e atendentes) para testes. <br>
Os sintomas do paciente foram mockados, para reduzir o nível de complexidade, e escopo do projeto.<br>
Ao criar o Paciente, os sintomas serão informados na sequência, e o médico (clinico geral ou neuro) darão um diagnóstico pré-pronto, quaisquer sejam os sintomas.<br>


import { AxiosError } from "axios";
import { useState } from "react";
import { ApiService } from '../../../services/ApiService';

export default function Cadastro(){
     const [name, setName] = useState(''),
        [historia, setHistoria] = useState(''),
        [foto, setFoto] = useState(''),
        [mensagem, setMensagem] = useState('');

    function cadastrar() {
        if(validarFormulario()) {
            ApiService.post('/pets', {
                name,
                historia,
                foto
            })
            .then(() => {
                limpar();
                setMensagem('Pet cadastrado com sucesso!')
            })
            .catch((error: AxiosError) => {
                setMensagem(error.response?.data.message);
            } )
        }else {
            setMensagem('Preencha todos os campos')
        }
    }

    function validarFormulario(){
        return name.length > 2 && historia.length > 20 && foto.length > 5;
    }

    function limpar(){
        setName('');
        setHistoria('');
        setFoto('');
    }

    return {
        name,
        historia,
        foto,
        setName,
        setHistoria,
        setFoto,
        cadastrar,
        mensagem,
        setMensagem
    }
}
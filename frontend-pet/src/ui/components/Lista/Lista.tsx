import { Button } from "@mui/material";

import {
  ListaStyled,
  ItemLista,
  Foto,
  Informacoes,
  Nome,
  Descricao,
} from "./Lista.style";

import { Pet } from "../../../data/@types/Pet";
import { TextService } from "../../../data/services/TextService";

interface ListaProps {
  pets: Pet[];
  onSelec: (pet: Pet) => void;
}

export default function Lista(props: ListaProps) {
  const tamanhoMaximoTexto = 200;

  return (
    <ListaStyled>
      {props.pets.map((pet) => (
        <ItemLista key={pet.id}>
          <Foto src={pet.foto} />
          <Informacoes>
            <Nome>{pet.name}</Nome>
            <Descricao>
              {TextService.limitarText(pet.historia, tamanhoMaximoTexto)}
            </Descricao>

            <Button 
            variant={"contained"} 
            fullWidth
            onClick={() => props.onSelec(pet)}
            >
              Adotar {pet.name}
            </Button>
          </Informacoes>
        </ItemLista>
      ))}
    </ListaStyled>
  );
}

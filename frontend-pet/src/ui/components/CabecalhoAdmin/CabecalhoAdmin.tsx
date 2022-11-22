import { Link, Box } from '@mui/material';
import NextLink from 'next/link';
import {
    CabecalhoContainer,
    Logo,
    LinksContainer
} from './CabecalhoAdminStyle';

export default function CabecalhoAdmin(){
    return (
        <CabecalhoContainer>
            <div>
                <Logo src={'/imagens/logo.svg'} alt={'Adote um pet'} />
                <LinksContainer>
                    <Link legacyBehavior component={NextLink} href={'/pets/cadastro'} >
                       <a> Cadastrar Pet</a>
                        </Link>
                    <Link legacyBehavior component={NextLink} href={'/pets/relatorio'} >
                        <a>Relatório {' '}
                            <Box
                                component={'span'}
                                sx={{display:{sm: 'initial', xs: 'none'} }}
                                > 
                                de adoção
                            </Box>
                        </a>
                        </Link>
                </LinksContainer>
            </div>
        </CabecalhoContainer>
    )
}
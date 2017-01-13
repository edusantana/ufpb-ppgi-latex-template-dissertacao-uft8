require 'rake/clean'

desc "Compila a proposta de dissertação"
task :proposta do
    system "latexmk","-xelatex","proposta.tex"
end

desc "Compila a dissertação"
task :dissertacao do
    system "latexmk","-xelatex","dissertacao.tex"
end

task :default => :proposta

desc "Gerando release"
task :release, [:tag]  => [:proposta, :dissertacao] do |t,args|
  file_list = FileList.new('*.tex', '*.sty', "abnt-alf.*","code/*","images/eela.png","main.bib","ppgi.cls","README.md")
  system "zip ufpb-ppgi-latex-template-dissertacao-uft8-#{args.tag}.zip #{file_list.join(" ")}"
end

CLEAN.include("proposta.pdf","dissertacao.pdf","ufpb-ppgi-latex-template-dissertacao-uft8*.zip")

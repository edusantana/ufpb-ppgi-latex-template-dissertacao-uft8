desc "Compila a proposta de dissertação"
task :proposta do
    system "latexmk","-pdf","proposta.tex"
end

desc "Compila a dissertação"
task :dissertacao do
    system "latexmk","-pdf","dissertacao.tex"
end

task :default => :proposta

desc "Gerando release"
task :release,:tag do |t,args|
  file_list = FileList.new('*.tex', '*.sty', "abnt-alf.*","code/*","images/eela.png","main.bib","ppgi.cls","README.md")
  system "zip ufpb-ppgi-latex-template-dissertacao-uft8-#{args.tag}.zip #{file_list.join(" ")}"
end
